import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel, QLineEdit, QPushButton, QVBoxLayout, QWidget, QMessageBox


class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()

        self.setWindowTitle(" Form Login")
        self.setGeometry(300, 300, 600, 600)

        self.create_layout()

    def create_layout(self):
        self.layout = QVBoxLayout()

        self.label_username = QLabel("Username:", self)
        self.label_password = QLabel("Password:", self)

        self.input_username = QLineEdit(self)
        self.input_password = QLineEdit(self)
        self.input_password.setEchoMode(QLineEdit.Password)

        self.layout.addWidget(self.label_username)
        self.layout.addWidget(self.input_username)
        self.layout.addWidget(self.label_password)
        self.layout.addWidget(self.input_password)

        self.button = QPushButton("Login", self)
        self.button.clicked.connect(self.login)
        self.layout.addWidget(self.button)

        self.central_widget = QWidget()
        self.central_widget.setLayout(self.layout)
        self.setCentralWidget(self.central_widget)

    def login(self):
        username = self.input_username.text()
        password = self.input_password.text()

        if username == "Ferry" and password == "123":
            QMessageBox.information(self, "Info", "Login Berhasil!")
        else:
            QMessageBox.warning(self, "Peringatan", "Username atau password salah!")


if __name__ == '__main__':
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())



    