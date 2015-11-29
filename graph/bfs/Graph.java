package com.graph.bfs;

public class Graph {

	private final int MAX_VERTS=20;
	private Vertex[] vertexList;//存放顶点的数组
	private int adjMat[][];//邻接矩阵
	private int nVerts;//当前顶点数量
	private Queue theQueue;
	
	public Graph(){
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++)
			for(int k=0; k<MAX_VERTS; k++)
				adjMat[j][k]=0;
		theQueue = new Queue();
	}
	//添加顶点
	public void addVertex(char lab){
		vertexList[nVerts++]= new Vertex(lab);
	}
	//添加边
	public void addEdge(int start, int end){
		adjMat[start][end]=1;
		adjMat[end][start]=1;
	}
	public void displayVertex(int v){
		System.out.print(vertexList[v].label + "");
	}
	
	//广度优先
	public void bfs(){
		vertexList[0].wasVisited=true;
		displayVertex(0);
		theQueue.insert(0);
		int v2;
		while(!theQueue.isEmpty()){
			int v1=theQueue.remove();//从队头取出第一个顶点
			while((v2=getAdjUnvisitedVertex(v1)) != -1){
				vertexList[v2].wasVisited=true;
				displayVertex(v2);
				theQueue.insert(v2);
			}
		}
		for(int j=0; j<nVerts; j++)
			vertexList[j].wasVisited=false;//全部还原到初始状态
	}
	//获取指定顶点相邻接且未被访问过的顶点
	public int getAdjUnvisitedVertex(int v){
		for(int j=0; j<nVerts; j++)
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;//找到了一个与V顶点相邻接且未被访问过的顶点
		return -1;//未找到
	}
}
