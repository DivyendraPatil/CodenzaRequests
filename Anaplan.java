import java.util.*;

class CalculateShadow {

	public static int MethodToCalulateOverlappingShadow(int[][] buildings) {
		if (buildings.length == 0) {
			return 0;
		} else if (buildings.length == 1){
			return getArea(buildings[0][0], buildings[0][2], buildings[0][1]);
		}

		int atTheEnd = buildings[0][1];
		// for ordering, 
		PriorityQueue<Building> queue = new PriorityQueue<>();
		for (int[] b: buildings) {
			queue.offer(new Building(b[0], b[1], b[2]));
			atTheEnd = Math.max(atTheEnd, b[1]);
		}
		queue.offer(new Building(atTheEnd, 0, 0)); // When I use a while loop, I want to see the last element

		int result = 0;

		Building previous = queue.poll();
		Building current;

		do {
			current = queue.poll();

			/*if (current.height == previous.height && previous.end == current.start) {
				current.start = previous.start;
				previous = current;
			} else if (current.height < previous.height) {
				if (current.end < previous.end) {
					previous.start = current.end;
					queue.offer(previous);
				}
				previous = current;
				result += getArea(previous.start, previous.height, current.start);
			} else {
				result += getArea(previous.start, previous.height, current.start);
				previous = current;
			}*/
			if (current.height < previous.height && current.start < previous.end) {
				current.start += 1;
				queue.offer(current);
			} else {
				result += getArea(previous.start, previous.height, current.start);
				previous = current;
			}
		} while (!queue.isEmpty());

		return result;
	}

	public static int getArea(int left, int height, int right) {
		// System.out.println(left + ", "+ height + ", " + right);
		return (right - left) * height;
	}

	public static void main(String[] args) {
		int[][] buildings = {{1, 6, 7},{2, 4, 8}, {3, 9, 8}};
		System.out.println(MethodToCalulateOverlappingShadow(buildings));
		// If there is space between buildings, then it will have an issue and the commented code above will need refactoring.
		
		int[][] buildings2 = {{1, 4, 2},{2, 6, 1},{3, 5, 4}};
		System.out.println(MethodToCalulateOverlappingShadow(buildings2));
	}


	static class Building implements Comparable<Building> {
		//String name;
		Integer start, end, height;

		Building(int start, int end, int height) { //, String name) {
		//	this.name = name;
			this.start = start;
			this.end =  end;
			this.height = height;
		}

		@Override
		public int compareTo(Building b) {
			if (this.start == b.start) {
				return this.height.compareTo(b.height);
			} else {
				return this.start.compareTo(b.start);
			}
		}
	}
}

