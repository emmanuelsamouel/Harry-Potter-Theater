/*Harry Potter Theater
Programmed by Emmanuel Samouel, 6/21/2021
This program animates some scenes from the Harry Potter movies*/
import hsa.Console;
import java.awt.*;

public class CPT
{

    static Console c;
    static Console d;
    public static void main (String[] args)
    {
	c = new Console (35, 180);
	d = new Console (38, 125);
	char controller;

	int[] x = {705, 705, 830};
	int[] y = {410 - 110, 460 - 110, 460 - 110};

	Color grassColor = new Color (20, 136, 9);
	Color color1 = grassColor;

	Color connectorColor = new Color (36, 30, 27);
	Color color2 = connectorColor;

	Color skin = new Color (254, 198, 126);
	Color color3 = skin;

	Color sky = new Color (112, 185, 220);
	Color color4 = sky;
	Color[] colors = {color1, color2, color3, color4};
	//   displayTrain (colors, y);
	Color harryClothes = new Color (3, 44, 138);
	Color color5 = harryClothes;

	Font myFont2 = new Font ("Ariel", Font.BOLD, 70);
	Font myFont3 = new Font ("Ariel", Font.BOLD, 20);
	d.setFont (myFont3);


	d.setColor (Color.black);
	d.fillRect (0, 0, d.maxx (), d.maxy ());
	d.setColor (Color.gray);

	d.setFont (myFont2);
	d.drawString ("Harry Potter Theater", 0, 60);

	d.setFont (myFont3);
	d.setColor (Color.white);
	d.drawString ("Press a to watch Harry and Ron go to Hogwarts", 0, 100);
	d.drawString ("Press b to watch Harry kill Voldemort", 0, 125);
	d.drawString ("Press c to watch Voldemort kill Harry", 0, 150);
	int l = 0;
	int m = 0;
	d.drawString ("Enter a, b, or c", 0, 170);
	do
	{


	    controller = d.getChar ();
	    if (controller == 'a')
	    {
		displayTrain (colors, y);

	    } //end of if
	    else if (controller == 'b')
	    {
		harryWins (color3, color5);

	    }
	    else if (controller == 'c')
	    {
		voldemortWins (color3, color5);


	    }
	    else
	    {
		d.drawString ("Invalid Input", 0, 190 + m);
		m += 20;
	    } //end of else

	    d.drawString ("Press any key to replay. Then select your video.", 510, 80 + l);

	    d.drawString ("Press x to exit.", 510, 100 + l);
	    l += 40;
	    controller = d.getChar ();
	}
	while (controller != 'x');
	c.clear ();
	c.setColor (Color.black);
	c.fillRect (0, 0, c.maxx (), c.maxy ());
	c.setFont (myFont2);
	c.setColor (Color.gray);
	c.drawString ("The End", 570, 280);

    } //end of main()


    public static void voldemortWins (java.awt.Color a, java.awt.Color g)
    {
	//background
	c.setColor (Color.gray);
	c.fillRect (0, 0, c.maxx (), c.maxy ());
	//harry's body (left)
	//head
	c.setColor (a);
	c.fillArc (110 - 60, 150, 60, 100, 0, -180);
	c.fillArc (110 - 60, 175, 60, 50, 0, 180);
	//eyes
	c.setColor (Color.black);
	c.fillOval (147 - 60, 320 - 110, 10, 10);
	c.fillOval (123 - 60, 320 - 110, 10, 10);

	//glasses
	c.drawOval (120 - 60, 317 - 110, 15, 15);
	c.drawOval (144 - 60, 317 - 110, 15, 15);
	c.drawLine (135 - 60, 323 - 110, 145 - 60, 323 - 110);

	//hair
	for (int z = 0, j = 0 ; z < 5 ; z++)
	{
	    c.setColor (Color.black);
	    c.drawArc (120 - 60, 310 - 112 - j, 20, 5, 0, 180);
	    c.drawArc (140 - 60, 310 - 112 - j, 20, 5, 0, -180);

	    j += 4;

	} //end of for
	//smile
	c.drawArc (130 - 60, 340 - 110, 20, 5, 0, -180);
	c.setColor (a);
	//neck
	c.fillRect (135 - 60, 249, 10, 10);

	//chest
	c.setColor (g);
	c.fillRect (90 - 60, 275, 100, 110);
	//legs
	c.fillRect (90 - 60, 385, 40, 90);
	c.fillRect (150 - 60, 385, 40, 90);
	//shoulders
	c.fillArc (90 - 60, 260, 100, 30, 0, 180);
	//arm to the left
	c.fillRect (70 - 60, 290, 20, 90);
	c.fillArc (70 - 60, 275, 40, 40, 90, 90);
	//wand arm
	c.fillRect (130, 275, 60, 20);
	//wand
	c.setColor (Color.black);
	c.fillRect (280 - 90, 280, 30, 5);
	//shoes
	c.fillArc (70 - 60, 475, 20, 20, 90, 180);
	c.fillRect (80 - 60, 475, 50, 20);
	c.fillRect (150 - 60, 475, 50, 20);
	c.fillArc (190 - 60, 475, 20, 20, 90, -180);
	//voldemort's body (right)
	//head
	c.setColor (Color.LIGHT_GRAY);
	c.fillArc (1310 + 20, 150, 60, 100, 0, -180); //110; +1200
	c.fillArc (1310 + 20, 175, 60, 50, 0, 180);

	//eyes
	c.setColor (Color.black);
	c.fillOval (1347 + 20, 320 - 110, 10, 10);
	c.fillOval (1323 + 20, 320 - 110, 10, 10);
	//shoulders
	c.fillArc (1290 + 20, 260, 100, 30, 0, 180);
	//smile
	c.drawArc (1330 + 20, 340 - 110, 20, 5, 0, -180);

	//neck
	c.setColor (Color.LIGHT_GRAY);
	c.fillRect (1335 + 20, 249, 10, 10);

	//chest
	c.setColor (Color.black);
	c.fillRect (1290 + 20, 275, 100, 110);
	//legs
	c.fillRect (1290 + 20, 385, 40, 90);
	c.fillRect (1350 + 20, 385, 40, 90);
	//arm
	c.fillRect (1390 + 20, 290, 20, 90);
	c.fillArc (1370 + 20, 272, 40, 40, 0, 90);
	c.fillRect (1190 + 50 + 10, 275, 60, 20);

	//shoes
	c.fillArc (1270 + 20, 475, 20, 20, 90, 180);
	c.fillRect (1280 + 20, 475, 50, 20);
	c.fillRect (1350 + 20, 475, 50, 20);
	c.fillArc (1390 + 20, 475, 20, 20, 90, -180);
	//wand
	c.fillRect (1220, 280, 30, 5);
	for (int t = 0 ; t < 497 ; t++)
	{
	    //green beam from voldemort's wand
	    c.setColor (Color.green);
	    c.fillOval (1215 - t, 280, 5, 5);
	    delay (1);
	    //red beam from harry's wand
	    c.setColor (Color.red);
	    c.fillOval (t + 220, 280, 5, 5);
	    delay (1);

	} //end of for
	delay (3000);
	for (int t = 0 ; t < 499 ; t++)
	{
	    //wand beam (what comes out of the wand)
	    c.setColor (Color.green);
	    c.fillOval (1215 - 497 - t, 280, 5, 5);
	    if (t == 50)
	    {
		delay (3000);
	    }
	    delay (1);
	} //end of for
	//erase harry's original eyes
	c.setColor (a);
	c.fillOval (147 - 60, 320 - 110, 10, 10);
	c.fillOval (123 - 60, 320 - 110, 10, 10);
	//eyes after death
	c.setColor (Color.black);
	c.drawLine (89, 212, 94, 217);
	c.drawLine (89, 217, 94, 212);
	c.drawLine (65, 212, 70, 217);
	c.drawLine (65, 217, 70, 212);
	//erase both wand beams
	c.setColor (Color.gray);
	c.fillRect (220, 280, 1000, 5);
	delay (1000);
	//harry withering away
	for (int r = 0, s = 0 ; r < 30 ; r++)
	{
	    c.fillRect (210 - s, 5, 20, 700);
	    delay (2000);
	    s += 10;
	} //end of for

    } //end of voldemortWins()


    public static void harryWins (java.awt.Color f, java.awt.Color h)
    {
	//background
	c.setColor (Color.gray);
	c.fillRect (0, 0, c.maxx (), c.maxy ());
	//harry's body (left)

	//head
	c.setColor (f);
	c.fillArc (110 - 60, 150, 60, 100, 0, -180);
	c.fillArc (110 - 60, 175, 60, 50, 0, 180);
	//eyes
	c.setColor (Color.black);
	c.fillOval (147 - 60, 320 - 110, 10, 10);
	c.fillOval (123 - 60, 320 - 110, 10, 10);

	//glasses
	c.drawOval (120 - 60, 317 - 110, 15, 15);
	c.drawOval (144 - 60, 317 - 110, 15, 15);
	c.drawLine (135 - 60, 323 - 110, 145 - 60, 323 - 110);

	//hair
	for (int z = 0, j = 0 ; z < 5 ; z++)
	{
	    c.setColor (Color.black);
	    c.drawArc (120 - 60, 310 - 112 - j, 20, 5, 0, 180);
	    c.drawArc (140 - 60, 310 - 112 - j, 20, 5, 0, -180);


	    j += 4;

	} //end of for
	//smile
	c.drawArc (130 - 60, 340 - 110, 20, 5, 0, -180);
	//neck
	c.setColor (f);
	c.fillRect (135 - 60, 249, 10, 10);


	//chest
	c.setColor (h);
	c.fillRect (90 - 60, 275, 100, 110);
	//legs
	c.fillRect (90 - 60, 385, 40, 90);
	c.fillRect (150 - 60, 385, 40, 90);
	//shoulders
	c.fillArc (90 - 60, 260, 100, 30, 0, 180);
	//arm to the left
	c.fillRect (70 - 60, 290, 20, 90);
	c.fillArc (70 - 60, 275, 40, 40, 90, 90);
	//wand arm
	c.fillRect (130, 275, 60, 20);
	//wand
	c.setColor (Color.black);
	c.fillRect (280 - 90, 280, 30, 5);
	//shoes
	c.fillArc (70 - 60, 475, 20, 20, 90, 180);
	c.fillRect (80 - 60, 475, 50, 20);
	c.fillRect (150 - 60, 475, 50, 20);
	c.fillArc (190 - 60, 475, 20, 20, 90, -180);
	//voldemort
	//head
	c.setColor (Color.LIGHT_GRAY);
	c.fillArc (1310 + 20, 150, 60, 100, 0, -180);
	c.fillArc (1310 + 20, 175, 60, 50, 0, 180);
	//eyes
	c.setColor (Color.black);
	c.fillOval (1347 + 20, 320 - 110, 10, 10);
	c.fillOval (1323 + 20, 320 - 110, 10, 10);

	//smile
	c.drawArc (1330 + 20, 340 - 110, 20, 5, 0, -180);
	c.setColor (Color.LIGHT_GRAY);
	//neck
	c.fillRect (1335 + 20, 249, 10, 10);


	//shoulders
	c.setColor (Color.black);
	c.fillArc (1290 + 20, 260, 100, 30, 0, 180);
	//chest
	c.fillRect (1290 + 20, 275, 100, 110);
	//legs
	c.fillRect (1290 + 20, 385, 40, 90);
	c.fillRect (1350 + 20, 385, 40, 90);
	//arm
	c.fillRect (1390 + 20, 290, 20, 90);
	c.fillArc (1370 + 20, 272, 40, 40, 0, 90);
	//wand arm
	c.fillRect (1190 + 50 + 10, 275, 60, 20);
	//wand
	c.fillRect (1480 + 20, 280, 30, 5);
	//shoes
	c.fillArc (1270 + 20, 475, 20, 20, 90, 180);
	c.fillRect (1280 + 20, 475, 50, 20);
	c.fillRect (1350 + 20, 475, 50, 20);
	c.fillArc (1390 + 20, 475, 20, 20, 90, -180);
	//wand
	c.fillRect (1220, 280, 30, 5);
	for (int t = 0 ; t < 497 ; t++)
	{
	    //voldemort's wand beam
	    c.setColor (Color.green);
	    c.fillOval (1215 - t, 280, 5, 5);
	    delay (1);
	    //harry's wand beam
	    c.setColor (Color.red);
	    c.fillOval (t + 220, 280, 5, 5);
	    delay (1);

	} //end of for
	delay (3000);
	for (int t = 0 ; t < 499 ; t++)
	{
	    //harry's wand beam
	    c.setColor (Color.red);
	    c.fillOval (190 + 497 + t, 280, 5, 5);
	    if (t == 70)
	    {
		delay (3000);
	    }
	    delay (1);
	} //end of for
	//erase voldemort's original eyes
	c.setColor (Color.LIGHT_GRAY);
	c.fillOval (1366, 209, 12, 12);
	c.fillOval (1342, 209, 12, 12);
	//voldemort's eyes after death

	c.setColor (Color.black);
	c.drawLine (1369, 212, 1374, 217);
	c.drawLine (1369, 217, 1374, 212);
	c.drawLine (1345, 212, 1350, 217);
	c.drawLine (1345, 217, 1350, 212);
	//erase both wand beams
	c.setColor (Color.gray);
	c.fillRect (220, 280, 1000, 5);
	delay (1500);
	//wither away
	for (int r = 0, s = 0 ; r < 20 ; r++)
	{

	    c.fillRect (1220 + s, 5, 20, 700);
	    delay (2000);
	    s += 10;
	} //end of for

    } //end of harryWins()


    public static void displayTrain (Color[] colors, int[] y)
    {


	//grass
	c.setColor (colors [0]);
	c.fillRect (0, 435, c.maxx (), c.maxy ());

	//gravel above the grass
	c.setColor (Color.gray);
	c.fillRect (0, 390, c.maxx (), 65);
	//black bars
	c.setColor (Color.black);
	c.fillRect (0, 380, c.maxx (), 10);
	//sky
	c.setColor (colors [3]);
	c.fillRect (0, 0, c.maxx (), 380);

	//metal bars on train tracks
	c.setColor (Color.LIGHT_GRAY);
	for (int i = 0, j = 0 ; i < 19 ; i++)
	{
	    c.fillRect (25 + j, 390, 10, 55);
	    j += 80;
	} //end of for
	for (int i = 0 ; i < 1500 ; i++)
	{
	    c.setColor (Color.yellow);
	    int[] x = {705 + i, 705 + i, 830 + i};
	    c.fillPolygon (x, y, 3);
	    //first car
	    //main part of the car (red)
	    c.setColor (Color.red);
	    c.fillRect (430 + i, 240 - 110, 125, 170);
	    c.fillRect (555 + i, 330 - 110, 150, 85);

	    //yellow front
	    c.setColor (Color.yellow);
	    c.fillArc (670 + i, 330 - 110, 70, 80, -90, 180);
	    //roof
	    c.setColor (Color.green);
	    c.fillArc (420 + i, 220 - 110, 150, 20, 0, 180);
	    c.fillRect (420 + i, 230 - 110, 150, 10);
	    //under the base
	    c.setColor (Color.black);
	    c.fillRect (430 + i, 410 - 110, 275, 20);
	    //windows
	    c.setColor (Color.LIGHT_GRAY);
	    c.fillRect (515 + i, 285 - 110, 30, 90);
	    c.fillArc (515 + i, 270 - 110, 30, 30, 0, 180);
	    c.fillRect (440 + i, 285 - 110, 65, 60);
	    //smoke
	    c.setColor (Color.blue);
	    c.fillRect (650 + i, 270 - 110, 30, 60);
	    c.fillRect (640 + i, 260 - 110, 50, 10);
	    c.fillRect (610 + i, 320 - 110, 10, 10);
	    c.fillRect (580 + i, 300 - 110, 10, 30);
	    c.fillArc (580 + i, 295 - 110, 10, 10, 0, 180);
	    c.fillArc (610 + i, 315 - 110, 10, 10, 0, 180);
	    //wheels
	    c.setColor (Color.blue);
	    c.fillOval (440 + i, 430 - 110, 60, 60); //440, y = 430//good y = 320
	    c.fillOval (620 + i, 430 - 110, 60, 60);
	    c.setColor (Color.black);
	    c.fillOval (455 + i, 445 - 110, 30, 30);
	    c.fillOval (635 + i, 445 - 110, 30, 30);
	    //connector
	    c.setColor (colors [1]);
	    c.fillRect (390 + i, 400 - 110, 40, 20);
	    //base2
	    c.setColor (Color.red);
	    c.fillRect (25 + i, 240 - 110, 365, 170);
	    //under base and above
	    c.setColor (Color.black);
	    c.fillRect (25 + i, 410 - 110, 365, 20);
	    c.setColor (Color.red);
	    c.fillRect (15 + i, 220 - 110, 385, 20);
	    //wheels
	    c.setColor (Color.blue);
	    c.fillOval (70 + i, 430 - 110, 60, 60);
	    c.fillOval (290 + i, 430 - 110, 60, 60);
	    c.setColor (Color.black);
	    c.fillOval (85 + i, 445 - 110, 30, 30);
	    c.fillOval (305 + i, 445 - 110, 30, 30);
	    //big window 2
	    c.setColor (Color.LIGHT_GRAY);
	    c.fillRect (40 + i, 255 - 110, 335, 140);
	    //bodies
	    c.setColor (Color.black);
	    c.fillArc (40 + i, 355 - 110, 80, 80, 0, 180);
	    c.fillArc (295 + i, 355 - 110, 80, 80, 0, 180);
	    //heads
	    c.setColor (colors [2]);
	    c.fillOval (50 + i, 295 - 110, 60, 60);
	    c.fillOval (305 + i, 295 - 110, 60, 60);
	    //eyes
	    c.setColor (Color.black);
	    c.fillOval (63 + i, 320 - 110, 10, 10);
	    c.fillOval (87 + i, 320 - 110, 10, 10);
	    c.fillOval (320 + i, 320 - 110, 10, 10);
	    c.fillOval (340 + i, 320 - 110, 10, 10);
	    //glasses
	    c.setColor (Color.black);
	    c.drawOval (60 + i, 317 - 110, 15, 15);
	    c.drawOval (84 + i, 317 - 110, 15, 15);
	    c.drawLine (77 + i, 323 - 110, 84 + i, 323 - 110);
	    c.drawLine (99 + i, 324 - 110, 104 + i, 320 - 110);
	    c.drawLine (55 + i, 320 - 110, 59 + i, 321 - 110);
	    //hair
	    for (int a = 0, j = 0 ; a < 5 ; a++)
	    {
		c.setColor (Color.black);
		c.drawArc (60 + i, 310 - j - 110, 20, 5, 0, 180);
		c.drawArc (80 + i, 310 - j - 110, 20, 5, 0, -180);


		j += 3;

	    } //end of for
	    //ron's hair
	    for (int b = 0, j = 0 ; b < 5 ; b++)
	    {
		c.setColor (Color.black);
		c.drawArc (315 + i, 310 - 110 - j, 20, 5, 0, 180); //-j
		c.drawArc (335 + i, 310 - 110 - j, 20, 5, 0, -180);



		j += 3;

	    } //end of for
	    //smile
	    c.setColor (Color.black);
	    c.drawArc (70 + i, 340 - 110, 20, 5, 0, -180);
	    c.drawArc (325 + i, 340 - 110, 20, 5, 0, -180);

	    delay (30);


	    //erase main part of the car (red)
	    c.setColor (colors [3]);
	    c.fillRect (430 + i, 240 - 110, 125, 170);
	    c.fillRect (555 + i, 330 - 110, 150, 85);
	    //erase for yellow front
	    c.setColor (colors [3]);
	    c.fillArc (670 + i, 330 - 110, 70, 80, -90, 180);
	    //erase for roof
	    c.setColor (colors [3]);
	    c.fillArc (420 + i, 220 - 110, 150, 20, 0, 180);
	    c.fillRect (420 + i, 230 - 110, 150, 10);
	    //erase for under base
	    c.setColor (colors [3]);
	    c.fillRect (430 + i, 410 - 110, 275, 20);
	    //erase for windows
	    c.setColor (colors [3]);
	    c.fillRect (515 + i, 285 - 110, 30, 90);
	    c.fillArc (515 + i, 270 - 110, 30, 30, 0, 180);
	    c.fillRect (440 + i, 285 - 110, 65, 60);
	    //erase for smoke
	    c.setColor (colors [3]);
	    c.fillRect (650 + i, 270 - 110, 30, 60);
	    c.fillRect (640 + i, 260 - 110, 50, 10);
	    c.fillRect (610 + i, 320 - 110, 10, 10);
	    c.fillRect (580 + i, 300 - 110, 10, 30);
	    c.fillArc (580 + i, 295 - 110, 10, 10, 0, 180);
	    c.fillArc (610 + i, 315 - 110, 10, 10, 0, 180);
	    //erase for wheels
	    c.setColor (colors [3]);
	    c.fillOval (440 + i, 430 - 110, 60, 60);
	    c.fillOval (620 + i, 430 - 110, 60, 60);
	    c.setColor (Color.white);
	    c.fillOval (455 + i, 445 - 110, 30, 30);
	    c.fillOval (635 + i, 445 - 110, 30, 30);
	    //erase for connector
	    c.setColor (colors [3]);
	    c.fillRect (390 + i, 400 - 110, 40, 20);
	    //last car (car that is not driving)
	    //erase main part of the second car (red part)
	    c.setColor (colors [3]);
	    c.fillRect (25 + i, 240 - 110, 365, 170);
	    //erase under the car and roof
	    c.setColor (colors [3]);
	    c.fillRect (25 + i, 410 - 110, 365, 20);
	    c.fillRect (15 + i, 220 - 110, 385, 20);

	    //erase wheels
	    c.setColor (colors [3]);
	    c.fillOval (70 + i, 430 - 110, 60, 60);
	    c.fillOval (290 + i, 430 - 110, 60, 60);
	    c.setColor (Color.white);
	    c.fillOval (85 + i, 445 - 110, 30, 30);
	    c.fillOval (305 + i, 445 - 110, 30, 30);
	    // //last car big window
	    //c.setColor (colors [3]);
	    //c.fillRect (40 + i, 255 - 110, 335, 140);
	    //wo for bodies
	    //c.setColor (colors [3]);
	    //c.fillArc (40 + i, 355 - 110, 80, 80, 0, 180);
	    //c.fillArc (295 + i, 355 - 110, 80, 80, 0, 180);
	    //wo for heads
	    //c.setColor (colors [3]);
	    // c.fillOval (50 + i, 295 - 110, 60, 60);
	    // c.fillOval (305 + i, 295 - 110, 60, 60);
	    //wo for eyes
	    //c.setColor (colors [3]);
	    // c.fillOval (63 + i, 320 - 110, 10, 10);
	    // c.fillOval (87 + i, 320 - 110, 10, 10);
	    // c.fillOval (320 + i, 320 - 110, 10, 10);
	    // c.fillOval (340 + i, 320 - 110, 10, 10);
	    //wo for glasses
	    //  c.setColor (colors [3]);
	    // c.drawOval (60 + i, 317 - 110, 15, 15);
	    /// c.drawOval (84 + i, 317 - 110, 15, 15);
	    // c.drawLine (77 + i, 323 - 110, 84 + i, 323);
	    //  c.drawLine (99 + i, 324 - 110, 104 + i, 320);
	    // c.drawLine (55 + i, 320 - 110, 59 + i, 321);
	    //wo for harry's hair
	    // for (int a = 0, j = 0 ; a < 5 ; a++)
	    // {
	    //
	    //     c.setColor (colors [3]);
	    //     c.drawArc (60 + i, 310 - j - 110, 20, 5, 0, 180);
	    //     c.drawArc (80 + i, 310 - j - 110, 20, 5, 0, -180);
	    //
	    //     j += 3;
	    //
	    // } //end of for
	    // for (int b = 0, j = 0 ; b < 5 ; b++)
	    // {
	    //
	    //     c.setColor (colors [3]);
	    //     c.drawArc (315 + i, 310 - j - 110, 20, 5, 0, 180);
	    //     c.drawArc (335 + i, 310 - j - 110, 20, 5, 0, -180);
	    //
	    //     j += 3;
	    //
	    // } //end of for
	    //wo for smile
	    // c.setColor (colors [3]);
	    // c.drawArc (70 + i, 340 - 110, 20, 5, 0, -180);
	    // c.drawArc (325 + i, 340 - 110, 20, 5, 0, -180);
	    //erase front yellow
	    c.setColor (colors [3]);
	    int[] z = {705 + i, 705 + i, 830 + i};
	    c.fillPolygon (z, y, 3);


	}

    } //end of for


    public static void delay (int time)
    {
	try
	{
	    Thread.sleep (time);
	}


	catch (InterruptedException e)
	{
	}
    } //end of delay()
} //end of class


