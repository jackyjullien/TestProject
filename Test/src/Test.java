
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a=1; a<10; a++) {
			for (int b=1; b<10; b++) { 
				for (int c=1; c<10; c++) {
					for (int d=1; d<10; d++) {
						for (int e=1; e<10; e++) {
							for (int f=1; f<10; f++) {
								for (int g=1; g<10; g++) {
									for (int h=1; h<10; h++) {
										for (int i=1; i<10; i++) {
											int res = a + 13 * b / c + d + 12 * e - f - 11 + g * h / i - 10;
											if (res == 66) {
												System.out.println(a + ", "+ b + ", "+ c + ", "+ d + ", "+ e + ", "+ f + ", "+ g + ", "+ h + ", "+ i);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
