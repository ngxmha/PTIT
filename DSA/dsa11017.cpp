#include<iostream>
using namespace std;

int n;
int a[1001];

struct node{
	int data;
	node *left, *right;
	node(int x){
		data = x;
		left = right = NULL;
	}
};

void postOrder(node *root){
	if(root == NULL)
		return;
	if(root->left)
		postOrder(root->left);
	if(root->right)
		postOrder(root->right);
	cout << root->data << " ";
}

void insert(node **root, int x){
	if(*root == NULL){
		*root = new node(x);
		return;
	}
	node *tmp = *root;
	if(tmp->data > x)
		insert(&(tmp->left), x);
	if(tmp->data < x)
		insert(&(tmp->right), x);
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		node *root = NULL;
		cin >> n;
		for(int i = 0; i < n; i++){
			cin >> a[i];
			insert(&root, a[i]);
		}
		postOrder(root);
		cout << endl;
	}
}
	