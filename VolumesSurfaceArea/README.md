# Planning

## ALGORITHM
1. Ask the user what shape they are specifying
2. Create an object for whatever 3D shape the user chose
    - Prism, Sphere, Triangular Based Prism, etc.
3. Get all inputs for the dimensions of the shape
    - Height, width, depth for almost all shapes
      - Radius for sphere
      - Side lengths for triangle-based shapes
      - Make sure said inputs are possible for the shape given (for example triangular based prism: side1 + side2 must be > side3)
4. Calculations:
    - Calculate volume
        - Use formula (depends on the shape) with the given variables passed as attributes to method
        - Each different shape will have an overridden form with a different formula of the volume method in base "Prism" superclass
    - Calculate Surface area
        - Again, use formula depending on shape with the necessary variables passed as attributes to method
         - Overridden form of the surface area method in "Prism" superclass
5. Display Results (volume and surface area) as well as the given variables
