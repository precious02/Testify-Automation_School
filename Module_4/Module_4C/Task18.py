# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add another attribute can_walk with value of True

class Human:
    leg_count = '4'
    can_walk = True

    def __init__(self, name):
        self.name = name


Ada = Human('Ada')

print(Ada.name)
print(Ada.leg_count)
print(Ada.can_walk)
