from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        if username == 'ferry' and password == 'pebriansyah':
            return 'Halo, Ferry Pebriansyah kelas anda 1IA25. Selamat!! anda berhasil Login!'
        else:
            return 'Login gagal, Silahkan coba lagi.'
    return render_template('login.html')

if __name__ == '__main__':
    app.run(debug=True)

