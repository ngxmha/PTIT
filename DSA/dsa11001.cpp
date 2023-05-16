#include<iostream>
#include<stack>
using namespace std;

string s;

struct Node{
	char data;
	Node *left, *right;
};

Node* root;

Node* makeNode(char x){
	Node* newnode = new Node;
	newnode->data = x;
	newnode->left = NULL;
	newnode->right = NULL;
	return newnode;
}

void in_order(Node* root){
	if(root == NULL)
		return;
	in_order(root->left);
	cout << root->data;
	in_order(root->right);
}

void make_tree(){
	cin >> s;
	stack<Node*> st;
	root = NULL;
	for(int i = 0; i < s.size(); i++){
		if(isalpha(s[i]))
			st.push(makeNode(s[i]));
		else {
			Node* r = st.top();
			st.pop();
			Node* l = st.top();
			st.pop();
			root = makeNode(s[i]);
			root->left = l;
			root->right = r;
			st.push(root);
		}
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		make_tree();
		in_order(root);
		cout << endl;
	}
}
	