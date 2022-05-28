package mylaptop;

public class Main {
    public static void main(String[] args) {
        AdjacencyList List = new AdjacencyList( 9);

        List.addEdge('A', 'B');
        List.addEdge('A', 'D');
        List.addEdge('A', 'E');
        List.addEdge('B', 'E');
        List.addEdge('C', 'B');
        List.addEdge('D', 'G');
        List.addEdge('E', 'F');
        List.addEdge('E', 'H');
        List.addEdge('F', 'C');
        List.addEdge('F', 'H');
        List.addEdge('G', 'H');
        List.addEdge('H', 'I');
        List.addEdge('I', 'F');

        List.cetakGraph();
    }
}
