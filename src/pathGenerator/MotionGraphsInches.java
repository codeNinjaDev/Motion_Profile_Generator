package pathGenerator;

import java.awt.Color;

public class MotionGraphsInches {
	static double fieldWidth = 324.0;
	static double[][] redSwitch = new double[][] { { 140.4, 85.26 }, { 195.6, 85.26 }, { 195.6, 238.74 }, { 140.4, 238.74 },
			{ 140.4, 85.26 }, };
	static double[][] autoLine = new double[][] { { 120, 0 }, { 120, fieldWidth } };
	static double[][] midLineUp = new double[][] { { 324, 324 }, { 324, 252 } };
	static double[][] midLineDown = new double[][] { { 324, 0 }, { 324, 72 } };
	static double[][] scaleUp = new double[][] { { 300, 216 }, { 348, 216 }, { 348, 252 }, { 300, 252 }, { 300, 216 }, };
	static double[][] scaleDown = new double[][] { { 300, 72 }, { 252, 72 }, { 252, 108 }, { 300, 108 }, { 300, 72 }, };
	static double[][] scaleSides = new double[][] { { 315.36, 108 }, { 332.64, 108 }, { 332.64, 216 }, { 315.36, 216 },
			{ 315.36, 108 }, };
	static double[][] nullZoneUp = new double[][] { { 300, 228.72 }, { 288, 195.6 }, { 288, 324 }, { 360, 324 },
			{ 360, 195.6 }, { 288, 195.6 }, };
	static double[][] nullZoneDown = new double[][] { { 300, 95.28 }, { 288, 95.28 }, { 288, 0 }, { 360, 0 }, { 360, 95.28 },
			{ 358, 95.28 }, };
	static double[][] platformZoneOne = new double[][] { { 195.6, 95.28 }, { 288, 95.28 } };
	static double[][] platformZoneTwo = new double[][] { { 195.6, 228.72 }, { 288, 228.72 } };
	static double[][] platform = new double[][] { { 261.36, 95.28 }, { 261.36, 228.72 } };
	static double[][] cubeZone = new double[][] { { 140.4, 139.5 }, { 98.4, 139.5 }, { 98.4, 184.5 }, { 140.4, 184.5 }, };
	static double[][] switchPlateOne = new double[][] { { 144, 88.86 }, { 192, 88.86 }, { 192, 124.86 }, { 144, 124.86 },
			{ 144, 88.86 }, };
	static double[][] switchPlateTwo = new double[][] { { 144, 234.78 }, { 192, 234.78 }, { 192, 199.14 }, { 144, 199.14 },
			{ 144, 234.78 }, };
	static double[][] portalBottom = new double[][] { { 0, 30 }, { 34.992, 0 } };
	static double[][] portalTop = new double[][] { { 0, 294 }, { 34.992, 324 } };
	static double[][] exchangeZone = new double[][] { { 0, 174 }, { 36, 174 }, { 36, 222 }, { 0, 222 }, };
	static double[][] cubeZoneCubes = new double[][] { { 140.4, 182.508 }, { 127.44, 182.508 }, { 127.44, 176.028 },
			{ 114.48, 176.028 }, { 114.48, 169.548 }, { 101.52, 169.548 }, { 101.52, 154.452 }, { 114.48, 154.452 },
			{ 114.48, 147.972 }, { 127.44, 147.972 }, { 127.44, 141.492 }, { 140.4, 141.492 }, };
	static double[][] cubeOne = new double[][] { { 195.6, 238.74 }, { 208.56, 238.74 }, { 208.56, 225.78 },
			{ 195.6, 225.78 }, };
	static double[][] cubeTwo = new double[][] { { 195.6, 210.684 }, { 208.56, 210.684 }, { 208.56, 197.724 },
			{ 195.6, 197.724 }, };
	static double[][] cubeThree = new double[][] { { 195.6, 182.628 }, { 208.56, 182.628 }, { 208.56, 169.668 },
			{ 195.6, 169.668 }, };
	static double[][] cubeFour = new double[][] { { 195.6, 154.33 }, { 208.56, 154.33 }, { 208.56, 141.372 },
			{ 195.6, 141.372 }, };
	static double[][] cubeFive = new double[][] { { 195.6, 126.276 }, { 208.56, 126.276 }, { 208.56, 113.316 },
			{ 195.6, 113.316 }, };
	static double[][] cubeSix = new double[][] { { 195.6, 98.22 }, { 208.56, 98.22 }, { 208.56, 85.26 }, { 195.6, 85.26 }, };
	
	static void motionGraphBlue()
	{
		// Create a blank grid for the field graph
		Gui.blueAllianceGraph.yGridOn();
		Gui.blueAllianceGraph.xGridOn();
		Gui.blueAllianceGraph.setYLabel("Y (inches)");
		Gui.blueAllianceGraph.setXLabel("X (inches)");
		Gui.blueAllianceGraph.setTitle("Top Down View of FRC Field - Blue Alliance (384in x 324in) \n shows the left and right wheel trajectories");
			
					
		//force graph to show field dimensions of 360 inches x 324 inches
		Gui.blueAllianceGraph.setXTic(0, 384, 12);
		Gui.blueAllianceGraph.setYTic(0, MotionGraphsInches.fieldWidth, 12);
					
					
		//lets add field markers to help visual
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.redSwitch, Color.black);
							
		// Auto Line
		Gui.blueAllianceGraph.addData(MotionGraphsInches.autoLine, Color.black);
								
		// Mid Field Up
		Gui.blueAllianceGraph.addData(MotionGraphsInches.midLineUp, Color.black);
				
		// Mid Field Down
		Gui.blueAllianceGraph.addData(MotionGraphsInches.midLineDown, Color.black);
								
		// Scale Up
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.scaleUp, Color.blue);
								
		// Scale Down
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.scaleDown, Color.red);
								
		// Scale sides
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.scaleSides, Color.black);
								
		// Null zone Up
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.nullZoneUp, Color.black);
				
		// Null zone Down
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.nullZoneDown, Color.black);
				
		// Platform Zone
		Gui.blueAllianceGraph.addData(MotionGraphsInches.platformZoneOne, Color.blue);
				
		// Platform Zone
		Gui.blueAllianceGraph.addData(MotionGraphsInches.platformZoneTwo, Color.blue);
				
		// Platform
		Gui.blueAllianceGraph.addData(MotionGraphsInches.platform, Color.blue);
				
		// Cube Zone
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeZone, Color.blue);
				
		// Switch Plate One
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.switchPlateOne, Color.red);
		// Switch Plate Two
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.switchPlateTwo, Color.blue);
		
		// Portal Bottom
		Gui.blueAllianceGraph.addData(MotionGraphsInches.portalBottom, Color.blue);
		
		// Portal Top
		Gui.blueAllianceGraph.addData(MotionGraphsInches.portalTop, Color.blue);
		
		// Exchange Zone
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.exchangeZone, Color.blue);
		
		// Cube Zone cubes
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeZoneCubes, Color.green);
		
		// Cube One
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeOne, Color.green);
		
		// Cube Two
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeTwo, Color.green);
		
		// Cube Three
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeThree, Color.green);
		
		// Cube Four
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeFour, Color.green);
		
		// Cube Five
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeFive, Color.green);
		
		// Cube Six
		
		Gui.blueAllianceGraph.addData(MotionGraphsInches.cubeSix, Color.green);
	}
	
	static void motionGraphRed()
	{
		Gui.blueAllianceGraph.yGridOn();
		Gui.blueAllianceGraph.xGridOn();
		Gui.blueAllianceGraph.setYLabel("Y (inches)");
		Gui.blueAllianceGraph.setXLabel("X (inches)");
		Gui.blueAllianceGraph.setTitle("Top Down View of FRC Field - Red Alliance (384in x 324in) \n shows the left and right wheel trajectories");
			
					
		//force graph to show field dimensions of 360 inches x 324 inches
		Gui.blueAllianceGraph.setXTic(0, 384, 12);
		Gui.blueAllianceGraph.setYTic(0, MotionGraphsInches.fieldWidth, 12);
					
					
		//lets add field markers to help visual
		
		Gui.redAllianceGraph.addData(MotionGraphsInches.redSwitch, Color.black);
					
		// Auto Line
		Gui.redAllianceGraph.addData(MotionGraphsInches.autoLine, Color.black);
						
		// Mid Field Up
		Gui.redAllianceGraph.addData(MotionGraphsInches.midLineUp, Color.black);
		
		// Mid Field Down
		Gui.redAllianceGraph.addData(MotionGraphsInches.midLineDown, Color.black);
						
		// Scale Up

		Gui.redAllianceGraph.addData(MotionGraphsInches.scaleUp, Color.blue);
						
		// Scale Down

		Gui.redAllianceGraph.addData(MotionGraphsInches.scaleDown, Color.red);
						
		// Scale sides

		Gui.redAllianceGraph.addData(MotionGraphsInches.scaleSides, Color.black);
						
		// Null zone Up

		Gui.redAllianceGraph.addData(MotionGraphsInches.nullZoneUp, Color.black);
		
		// Null zone Down

		Gui.redAllianceGraph.addData(MotionGraphsInches.nullZoneDown, Color.black);
		
		// Platform Zone
		Gui.redAllianceGraph.addData(MotionGraphsInches.platformZoneOne, Color.red);
		
		// Platform Zone
		Gui.redAllianceGraph.addData(MotionGraphsInches.platformZoneTwo, Color.red);
		
		// Platform
		Gui.redAllianceGraph.addData(MotionGraphsInches.platform, Color.red);
		
		// Cube Zone
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeZone, Color.red);
		
		// Switch Plate One
		Gui.redAllianceGraph.addData(MotionGraphsInches.switchPlateOne, Color.red);
		
		// Switch Plate Two
		Gui.redAllianceGraph.addData(MotionGraphsInches.switchPlateTwo, Color.blue);
		
		// Portal Bottom
		Gui.redAllianceGraph.addData(MotionGraphsInches.portalBottom, Color.red);
				
		// Portal Top
		Gui.redAllianceGraph.addData(MotionGraphsInches.portalTop, Color.red);
		
		// Exchange Zone

		Gui.redAllianceGraph.addData(MotionGraphsInches.exchangeZone, Color.red);
		
		// Exchange Zone
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeZoneCubes, Color.green);
		
		// Cube One
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeOne, Color.green);
				
		// Cube Two
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeTwo, Color.green);
				
		// Cube Three
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeThree, Color.green);
			
		// Cube Three
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeFour, Color.green);
			
		// Cube Five
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeFive, Color.green);
				
		// Cube Six
		Gui.redAllianceGraph.addData(MotionGraphsInches.cubeSix, Color.green);
	}
	
	static void velocityGraph()
	{
		Gui.velocityGraph.yGridOn();
      	Gui.velocityGraph.xGridOn();
      	Gui.velocityGraph.setYLabel("Velocity (in/sec)");
      	Gui.velocityGraph.setXLabel("time (seconds)");
      	Gui.velocityGraph.setTitle("Velocity Profile for Left and Right Wheels \n Left = Cyan, Right = Magenta");
	}
}