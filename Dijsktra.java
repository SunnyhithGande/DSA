import java.util.*;
public class Dijsktra 
{
    static class Pair implements Comparable<Pair>
    {
        int vertex;
        int weight;
        public Pair(int v, int w)
        {
            vertex = v;
            weight = w;
        }
        public int compareTo(Pair p)
        {
            return weight - p.weight;
        }
    }
    static class Graph
    {
        int V;
        ArrayList<ArrayList<Pair>> graph;
        public Graph(int vertices)
        {
            V = vertices;
            graph = new ArrayList<ArrayList<Pair>>();
            for (int i = 0; i < V; i++)
            {
                graph.add(new ArrayList<Pair>());
            }
        }
        public void addEdge(int u, int v, int w)
        {
            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }
        public void printSolution(int dist[])
        {
            System.out.println("Vertex \t Distance from Source");
            for (int i = 0; i < V; i++)
            {
                System.out.println(i + "\t\t" + dist[i]);
            }
        }
        public void dijkstra(int src)
        {
            int dist[] = new int[V];
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++)
            {
                dist[i] = Integer.MAX_VALUE;
                visited[i] = false;
            }
            dist[src] = 0;
            PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
            pq.add(new Pair(src, 0));
            while (!pq.isEmpty())
            {
                Pair p = pq.poll();
                int u = p.vertex;
                if (visited[u])
                {
                    continue;
                }
                visited[u] = true;
                for (int i = 0; i < graph.get(u).size(); i++)
                {
                    Pair pair = graph.get(u).get(i);
                    int v = pair.vertex;
                    int w = pair.weight;
                    if (!visited[v] && dist[v] > dist[u] + w)
                    {
                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            } 
            printSolution(dist);
        }
        public static void main(String args[])
        {
             Graph g = new Graph(9);
             g.addEdge(0, 1, 4);
             g.addEdge(0, 7, 8);
             g.addEdge(1, 2, 8);
             g.addEdge(1, 7, 11);
             g.addEdge(2, 3, 7);
             g.addEdge(2, 5, 4);
             g.addEdge(2, 8, 2);
             g.addEdge(3, 4, 9);
             g.addEdge(3, 5, 14);
             g.addEdge(4, 5, 10);
             g.addEdge(5, 6, 2);
             g.addEdge(6, 7, 1);
             g.addEdge(6, 8, 6);
             g.addEdge(7, 8, 7);
             g.dijkstra(0);
        }
     }
}

                                                                   