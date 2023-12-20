class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
		  int n = image.length;
		 //Flipping Horizontally
		 for(int i=0;i<n;i++) {
	        	for(int j=0;j<n/2;j++) {
	        		image[i][j] = image[i][j] + image[i][image.length-j-1];
	        		image[i][image.length-j-1] = image[i][j] - image[i][image.length-j-1];
	        		image[i][j] = image[i][j] -  image[i][image.length-j-1] ;
	        		
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