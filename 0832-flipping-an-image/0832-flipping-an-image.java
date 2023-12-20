class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
		 int n = image.length;
		 //Flipping Horizontally
		 for(int i=0;i<n;i++) {
	        	for(int j=0;j<n/2;j++) {
	        		int c = image[i][j];
	        		//System.out.println(c);
	        			

	        		image[i][j] = image[i][image.length-j-1];
	        		//System.out.println(image[i][j]);
	        		image[i][image.length-j-1] = c;
	        		//System.out.println(image[i][image.length-1-i]);
	        	}
	        }
		 //Inverting the image
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				if(image[i][j]==1) {
					image[i][j] = 0;
				}
				else {
					image[i][j] = 1;
				}
			 }
		 }
		 
		 return image;
    }
}