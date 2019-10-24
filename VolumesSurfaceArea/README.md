# Planning

## ALGORITHM
1. Ask the user what shape type they are specifying (2D or 3D)
2. Create the objects for whatever 3D/2D shapes the user chose and change directories with the corresponding shape type
    - Prism, Sphere, Square Based Pyramid, Triangle, circle etc.
3. Get all inputs for the dimensions of the shape and make sure they are double values > 0
    - Height, width, depth for almost all shapes
      - Radius for sphere
      - Make sure triangle input (possible inputs) is valid before continues
4. Calculations:
    - Calculate volume
        - Use formula (depends on the shape) with the given variables passed as attributes to method
        - Each different shape will have an overridden form with a different formula of the volume method in base "Prism" superclass
    - Calculate Surface area
        - Again, use formula depending on shape with the necessary variables passed as attributes to method
         - Overridden form of the surface area method in "Prism" superclass
    - Calculate perimeter
    	  - Add all the side lengths based on inputed values
        - Overridden form of the perimeter method in twoDshape
    - Calculate area
			  - Depending on formula, set value of area
        - Overridden form of the area method in twoDshape
5. Display Results (volume, surface area or area, perimeter)

## UML DIAGRAM
[![UML Diagram](https://i.gyazo.com/9c467cac42b4b51a0cafa6d63ca4f289.png)](https://gyazo.com/9c467cac42b4b51a0cafa6d63ca4f289)

## PSEUDOCODE

1. Give user instructions
2. Get what shape they want to calculate (or exit)
    - Exit if input = 0
    - Assign each shape a number and prompt them to select a number from the given list Prism = 1, Square Pyramid = 5
    - Make sure input is an integer and within 1 to 5
3. Depending on the selected shape, run the set of methods associated with its calculations and output (specified below)
4. Get required attributes
    - Prism: length, width, height
    - Sphere: radius
    - Cylinder: height, radius
    - Cone: height, radius
    - Square Pyramid: width, height
      - Inputs will vary depending on the shape
    - Make sure inputs are a double and positive input
5. Calculate volume
    - Using the inputted values, run them through the formula in the overloaded calcVolume method or the normal calcVolume method if it is a prism object (depends on the shape chosen)
        - Prism: length \* width \* height
        - Sphere: 4/3 \* π \* radius ^ 3
        - Cylinder: (π \* radius ^ 2) \* height
        - Cone: π * r ^ 2 \* (height / 3)
        - Square Based Pyramid: (width ^ 3) \* (height / 3)
    - Assign resulting volume to the volume attribute
6. Calculate Surface Area
    - Using the inputted values, run them through the formula in the overloaded calcSurfaceArea method or the normal calcSurfaceArea method if it is a prism object (depends on the shape chosen)
        - Prism: 2(length \* width + length \* height + width \* height)
        - Sphere: 4 \* π \* radius ^ 2
        - Cylinder: 2 \* π \* radius ^ 2 + 2 \* π \* radius \* height
        - Cone: π \* radius(radius + sqrt(height ^ 2 + radius ^ 2))
        - Square Based Pyramid: width ^ 2 + 2 \* width \* sqrt((width ^ 2)/4 + height ^ 2)
    - Assign resulting surface area to the surfaceArea attribute
7. Output results
    - Using the calculated volume and surface area in the previous step, print the values
8. Ask the user if they want to calculate another shape
    - Return to step 1
