package com.NatWest.Iteration;

public class Runner {

	public static void main(String[] args) {
		
		int catCount = 0;
        boolean notEnoughCats = true;

        while(notEnoughCats) {
            System.out.println("Another cat");
            catCount++;

            if(catCount >= 5) {
                notEnoughCats = false;
            }
        }
	}
}
//
//        System.out.println("Too many cats what do I do");
//    }
		
//		 public static int playCount = 0;
//		 public static boolean playing = true;
//
//		    public static void main(String[] args) {
//		        do {
//		            System.out.println("Playing");
//		            playCount++;
//
//		            if(playCount > 5) {
//		                playing = false;
//		            }
//		        } while(playing);
//
//		        System.out.println("Game Over!");
//		    }
	
//	 public static void main(String[] args) {
//	        for(int i = 0; i < 5; i++) {
//	            System.out.println("Hello There!");
//	        }
//	    }
//	
//	 public static void main(String[] args) {
//	        for(int i = 0; i < 10; i++) {
//	            if(i == 2) {
//	                continue;
//	            }
//	            if(i == 7) {
//	                break;
//	            }
//	            System.out.println(i);
//	        }
//	    }
//	
//	}

