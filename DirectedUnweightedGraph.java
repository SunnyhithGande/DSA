import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class DirectedUnweightedGraph 
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
    DirectedUnweightedGraph(int v)
    {
        this.v=v;
        this.graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<Edge>();
    }
    public void addEdge(int s,int d)
    {
        Edge edge = new Edge(s,d);
        graph[s].add(edge);
    }
    public void printGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<v;i++){
            ArrayList<Edge> currList = graph[i];
            System.out.print("for "+i+" ");
            for(Edge e:currList){
                System.out.print("->"+e.d);
            }
            System.out.println();
        }
    }
    public void findAllpaths(int s, int d, String path, boolean visited[])
    {
        if(s==d){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[s].size();i++)
        {
            Edge e = graph[s].get(i);
            int des = e.d;
            if(!visited[des])
            {
                visited[des] = true;
                findAllpaths(des, d, path+"->"+des, visited);
                visited[des] = false;
            }
        }
    }
    public void BFS(int start , boolean visited[])
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        visited[start] = true;
        while(!queue.isEmpty())
        {
            int temp = queue.poll();

            System.out.print(temp+" ");
            for(int i=0;i<graph[temp].size();i++)
            {
                Edge e = graph[temp].get(i);
                int dest = e.d;
                if(visited[dest]!= true)
                {
                    queue.offer(dest);
                    visited[dest] = true;
                }
            }
        }    
    }
    public void DFS(int node, boolean  visited[])
    {
        visited[node] = true;
        System.out.print(node+" ");
        for(int i=0;i<graph[node].size();i++)
        {
            Edge e = graph[node].get(i);
            int dest = e.d;
            if(!visited[dest])
            {
                DFS(dest, visited);
            }
        }   
    }
    boolean isCycleDirected() {
        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (isCyclicUtilDirected(i, visited, recStack)) 
            {
                return true;
            }
        }
        return false;
    }
    
    boolean isCyclicUtilDirected(int curr, boolean[] visited, boolean[] recStack) 
    {
        if (recStack[curr]) 
        {
            return true;
        }
        if (visited[curr]) 
        {
            return false;
        }
        visited[curr] = true;
        recStack[curr] = true;
        for (Edge e : graph[curr]) 
        {
            if (isCyclicUtilDirected(e.d, visited, recStack)) 
            {
                return true;
            }
        }
        recStack[curr] = false;
        return false;
    }
    
    
    public static void main(String args[]) 
    {
        DirectedUnweightedGraph ob = new DirectedUnweightedGraph(4);
        ob.addEdge(0, 1);
        ob.addEdge(1, 2);
        ob.addEdge(2, 3);
        ob.addEdge(3, 2);
        boolean hasCycle = ob.isCycleDirected();
        System.out.println("Graph contains a cycle: " + hasCycle);
    }
    
}    