import java.util.*;
class BFS
{
    static class Edge 
    {
        int s,d;
        Edge(int s,int d) 
        {
            this.s=s;
            this.d=d;
        }
    }
    int v;
    ArrayList<Edge> graph[];
    BFS(int v) {
        this.v=v;
        this.graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<Edge>();
    }
    public void addEdge(int s,int d) {
        Edge edge=new Edge(s,d);
        graph[s].add(edge);
        Edge edge2=new Edge(d,s);
        graph[d].add(edge2);
    }
    public void bfs(int start) {
        boolean visited[]=new boolean[v];
        Queue<Integer> queue=new LinkedList();
        queue.offer(start);
        visited[start]=true;
        while(!queue.isEmpty()) 
        {
            int temp=queue.poll();
            System.out.print(temp+" ");
            for(int i=0;i<graph[temp].size();i++) 
            {
                Edge e=graph[temp].get(i);
                int dest=e.d;
            if(visited[dest]!=true) {
                queue.offer(dest);
                visited[dest]=true;
            }
        }
    }
    }
    public static void main(String args[]){
        BFS ob = new BFS(5);
        ob.addEdge(0,1);
        ob.addEdge(0,3);
        ob.addEdge(1,2);
        ob.addEdge(1,3);
        ob.addEdge(2,3);
        ob.addEdge(3,1);
        ob.addEdge(4,1);
        ob.bfs(0);
    }
}