package maze;

public class MazeSolver {

	public static void main(String[] args) {
		//S is the start
		//E is the end
		char maze[][] = 
			  { { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
		        { '#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#' },
		        { 'S', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#' },
		        { '#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#' },
		        { '#', '.', '.', '.', '#', '#', '#', '#', '.', '#', '.', 'E' },
		        { '#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
		        { '#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
		        { '#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
		        { '#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#' },
		        { '#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#' },
		        { '#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#' },
		        { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' } };
		Maze m1 = new Maze(maze);
		
		m1.solve(2, 1);
		m1.printMaze(maze);

	}

}
