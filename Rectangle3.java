import java.util.Scanner;
        public class Rectangle3 {
	        public static void main(String[]args) {
		        Scanner keyboard = new Scanner (System.in);
			        double width = 0.0;
				        double height = 0.0;
					        double perimeter = 0.0;
						        double area = 0.0;
							        System.out.println("enter width");
								        width = keyboard.nextDouble();
									        System.out.println("Enter height");
										        height = keyboard.nextDouble();
											        perimeter = 2*(width+height);
												        area = width*height;
													        System.out.println("Perimeter of this rectangle is" + perimeter);
														        System.out.println("Area of this rectangle is" + area);
															        }
																        }
