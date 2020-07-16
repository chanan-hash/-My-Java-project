// זה לא יכול להיות מחלקה ראשית, אחרת הוא יחשוב על דרך להריץ את זה בתור אפליקציה ולא בתור חלון נפתח וזה נתן שגיאה, כי דברים מהסוג הזה לא רצים בתור אפליקציה אלא בתור תוכנה כבר, חלון חדש 
// java runs it as a applet and not as a app, that why it can't has a main class. if you'd have so, it will give you an Error.
package A;

import java.applet.*;
import java.awt.*;


public class ChessBoard extends Applet {

		int x,y,dx,dy;

		public void paint(Graphics g) {
			x=1;
			y=1;
			dx = 50;
			dy = 50;

			for(int i =1; i<=8; i++) {
				for(int j =1; j<=8;j++) {
					if(i%2==1) {
						if(j%2==0) {
							g.setColor(Color.WHITE); 
						}else {
							g.setColor(Color.BLACK);
						}
					}else {
						if(j%2==0) {
							g.setColor(Color.BLACK);
						}else {
							g.setColor(Color.WHITE);
						}
					}
					g.fillRect(x, y, dx, dy);
					x = x + dx;
				}	
				y = y+dy;
				x =1;
			}

		}
	}

