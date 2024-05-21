class Mamalia:
    def __init__(self, spesies) :
        self.__spesies = spesies
    def tampilkan_spesies(self):
        print('Saya adalah seekor', self.__spesies)
    def buat_suara(self):
        print('Grrrr')
        
class Anjing(Mamalia):
    def __init__(self):
        Mamalia.__init__(self, 'Anjing')
    def buat_suara(self):
        print('Guk! Guk!')
        
class Kucing(Mamalia):
    def __init__(self):
        Mamalia.__init__(self, 'Kucing')
    def buat_suara(self):
        print('Meong!')



