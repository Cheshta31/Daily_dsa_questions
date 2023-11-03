import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class WebPageClicks {
    public static int minClicksToReachEndPage(int N, ArrayList<ArrayList<Integer>> webPages, int startPage, int endPage) {
        // Create an array to represent the web page links
        ArrayList<ArrayList<Integer>> links = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            links.add(webPages.get(i));
        }

        // Initialize a queue for BFS and a boolean array to keep track of visited pages
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[N + 1];

        // Initialize the starting page with a distance of 0
        queue.add(startPage);
        visited[startPage] = true;
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int currentPage = queue.poll();

                // If the current page is the end page, return the distance
                if (currentPage == endPage) {
                    return distance;
                }

                // Explore all linked pages from the current page
                for (int linkedPage : links.get(currentPage)) {
                    if (!visited[linkedPage]) {
                        queue.add(linkedPage);
                        visited[linkedPage] = true;
                    }
                }
            }

            distance++;
        }

        // If the end page cannot be reached from the start page, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of web pages (N):");
        int N = scanner.nextInt();
        ArrayList<ArrayList<Integer>> webPages = new ArrayList<>(N);

        System.out.println("Enter the linked pages for each web page:");
        for (int i = 0; i < N; i++) {
            System.out.print("Number of linked pages for page " + (i + 1) + ": ");
            int L = scanner.nextInt();
            ArrayList<Integer> linkedPages = new ArrayList<>();
            System.out.print("Linked pages for page " + (i + 1) + ": ");
            for (int j = 0; j < L; j++) {
                linkedPages.add(scanner.nextInt());
            }
            webPages.add(linkedPages);
        }

        System.out.println("Enter the starting web page:");
        int startPage = scanner.nextInt();

        System.out.println("Enter the ending web page:");
        int endPage = scanner.nextInt();

        // Calculate and print the minimum number of clicks
        int result = minClicksToReachEndPage(N, webPages, startPage, endPage);
        System.out.println("Minimum clicks required: " + result);
    }
}
