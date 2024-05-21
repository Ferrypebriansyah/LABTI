from flask import Flask, request, jsonify
from werkzeug.routing import Map, Rule

app = Flask(__name__)

url_map = Map ([
    Rule('/', endpoint='home'),
    Rule('/user/<username>', endpoint='profile'),
    Rule('/blog/<int:blog_id>', endpoint='blogging'),
])

def home():
    return 'Hello, World!'

def profile(username):
    if request.method == 'GET':
        profile_list = ['Ferry Pebriansyah', '1IA25', 'Teknik Informatika', 'Fakultas Teknologi Industri']
        return jsonify(profile_list)
    
def blogging(blog_id):
    if request.method == 'GET':
        blogging_data = { 'id': blog_id, 'title': 'Ini adalah halaman blog ke {}'.format(blog_id)}
        return jsonify(blogging_data)
    
app.add_url_rule('/', endpoint='home', view_func=home)
app.add_url_rule('/user/<username>', endpoint='profile', view_func=profile, methods=['GET'])
app.add_url_rule('/blog/<int:blog_id>', endpoint='blogging', view_func=blogging, methods=['GET'])

if __name__ == '__main__':
    app.run(debug=True)



