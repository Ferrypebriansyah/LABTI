import sys
from PyQt5.QtWidgets import *

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        
        self.setWindowTitle("Contoh Program PyQt5")
        self.setGeometry(200, 200, 600, 400)
        
        self.create_layout()
        
    def create_layout(self):
        self.layout = QVBoxLayout()
        
        self.label_nama = QLabel("Nama: ", self)
        self.label_kelas = QLabel("Kelas: ", self)
        self.label_npm = QLabel("NPM: ", self)
        self.label_email = QLabel("Email: ", self)
        
        self.input_nama = QLineEdit(self)
        self.input_kelas = QLineEdit(self)
        self.input_npm = QLineEdit(self)
        self.input_email = QLineEdit(self)
        
        self.layout.addWidget(self.label_nama)
        self.layout.addWidget(self.input_nama)
        self.layout.addWidget(self.label_kelas)
        self.layout.addWidget(self.input_kelas)
        self.layout.addWidget(self.label_npm)
        self.layout.addWidget(self.input_npm)
        self.layout.addWidget(self.label_email)
        self.layout.addWidget(self.input_email)
        
        self.button = QPushButton("Tampilkan", self)
        self.button.clicked.connect(self.tampilkan_hasil)
        self.layout.addWidget(self.button)
        
        self.central_widget = QWidget()
        self.central_widget.setLayout(self.layout)
        self.setCentralWidget(self.central_widget)
        
    def tampilkan_hasil(self):
        nama = self.input_nama.text()
        kelas = self.input_kelas.text()
        npm = self.input_npm.text()
        email = self.input_email.text()
        hasil = f'Nama  : {nama}\nKelas   : {kelas}\nNPM    : {npm}\nEmail  : {email}'
        
        self.hasil_label = QLabel(hasil, self)
        self.layout.addWidget(self.hasil_label)
        
if __name__ == '__main__':
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())
    
    