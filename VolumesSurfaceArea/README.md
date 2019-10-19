# Planning

## ALGORITHM
1. Ask the user what shape they are specifying
2. Create an object for whatever 3D shape the user chose
    - Prism, Sphere, Square Based Pyramid, etc.
3. Get all inputs for the dimensions of the shape
    - Height, width, depth for almost all shapes
      - Radius for sphere
4. Calculations:
    - Calculate volume
        - Use formula (depends on the shape) with the given variables passed as attributes to method
        - Each different shape will have an overridden form with a different formula of the volume method in base "Prism" superclass
    - Calculate Surface area
        - Again, use formula depending on shape with the necessary variables passed as attributes to method
         - Overridden form of the surface area method in "Prism" superclass
5. Display Results (volume and surface area) as well as the given variables

## UML DIAGRAM
[![UML Table Image](https://i.gyazo.com/1ad25a01076725f05ef02612baf5e57f.png)](https://gyazo.com/1ad25a01076725f05ef02612baf5e57f)

## PSEUDOCODE

1. Give user instructions
2. Get what shape they want to calculate (or exit)
    - Assign each shape a number and prompt them to select a number from the given list Prism = 1, Square Pyramid = 5
    - Make sure input is integer and within 1 to 5
3. Depending on selected shape, instansiate object using the corresponding shape class
4. Get required attributes
	- Prism: length, width, height
	- Sphere: radius
	- Cylinder: height, radius
	- Cone: height, radius
	- Square Pyramid: width, height
  	- Inputs will vary depending on shape
	- Make sure inputs are a double and positive input
5. Calculate volume
	- Using the inputed values, run them through the formula in the overloaded calcVolume method or the normal calcVolume method if it is a prism object (depends on shape chosen)
		- Prism: length \* width \* height
		- Sphere: 4/3 \* π \* radius
		- Cylinder: (π \* radius ^ 2) \* height
		- Cone: π * r ^ 2 \* (height / 3)
		- Square Based Pyramid: (width ^ 3) \* (height / 3)
	- Assign resulting volume to the volume attribute
6. Calculate Surface Area
	- Using the inputed values, run them through the formula in the overloaded calcSurfaceArea method or the normal calcSurfaceArea method if it is a prism object (depends on shape chosen)
		- Prism: 2(length \* width + length \* height + width \* height)
		- Sphere: 4 \* π \* radius ^ 2
		- Cylinder: 2 \* π \* radius ^ 2 + 2 \* π \* radius \* height
		- Cone: π \* radius(radius + sqrt(height ^ 2 + radius ^ 2))
		- Sqaure Based Pyramid: width ^ 2 + 2 \* width \* sqrt((width ^ 2)/4 + height ^ 2)
	- Assign resulting surface area to the surfaceArea attribute
7. Output results
	- Using the calculated volume and surface area in the previous step, print the values
8. Ask the user if they want to calculate another shape
	- Return to step 1
