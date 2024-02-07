# Create a class called Human
# Initialize the class

class Human:
    name = 'Ada'
    school = 'Covenant University'

    def get_name_school(self):
        return self.name + ':' + self.school


Ada = Human()
print(Ada.name, Ada.school, Ada.get_name_school())
