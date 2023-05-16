// #include<iostream>
// #include<queue>
// using namespace std;

// int n;

// struct Node{
// 	int data;
// 	Node *left, *right;
// 	Node(int x){
// 		data = x;
// 		left = right = NULL;
// 	}
// };

// void leverOrder(Node *root){
// 	queue<Node*> q;
// 	q.push(root);
// 	while(!q.empty()){
// 		Node *nd = q.front();
// 		q.pop();
// 		cout << nd->data << " ";
// 		if(nd->left != NULL)
// 			q.push(nd->left);
// 		if(nd->right)
// 			q.push(nd->right);
// 	}
// }

// void insert(Node *root, int n1, int n2, char c){
// 	if(root == NULL)
// 		return;
// 	if(root->data == n1){
// 		if(c == 'L')
// 			root->left = new Node(n2);
// 		else 
// 			root->right = new Node(n2);
// 	}
// 	else {
// 		insert(root->left, n1, n2, c);
// 		insert(root->right, n1, n2, c);
// 	}
// }
// int main(){
// 	// freopen("Inputc++.in", "r", stdin);
// 	int t;	cin >> t;
// 	while(t--){
// 		cin >> n;
// 		Node *root = NULL;
// 		while(n--){
// 			int n1, n2;
// 			char c;
// 			cin >> n1 >> n2 >> c;
// 			if(root == NULL){
// 				root = new Node(n1);
// 				if(c == 'L')
// 					root->left = new Node(n2);
// 				else
// 					root->right = new Node(n2);
// 			}
// 			else 
// 				insert(root, n1, n2, c);
// 		}
// 		leverOrder(root);
// 		cout << endl;
// 	}
// }
// 	

#include<iostream>
#include<queue>
using namespace std;

int N;

struct Node{
	int data;
	Node *left, *right;
};

Node *makenode(int x){
	Node *newnode = new Node();
	newnode->data = x;
	newnode->left = newnode->right = NULL;
	return newnode;
}

void insert(Node **head, int u, int v, char x){
	Node *temp = *head;
	if(temp == NULL)
		return;
	if(temp->data == u){
		if(x == 'L'){
			temp->left = makenode(v);
		}
		else {
			temp-> right = makenode(v); 
		}
	}
	else {
		insert(&(temp->left), u, v, x);
		insert(&(temp->right), u, v, x);
	}
}

void leverOrder(Node **head){
	queue<Node*> q;
	q.push(*head);
	while(!q.empty()){
		Node *temp = q.front();
		q.pop();
		cout << temp->data << " ";
		if(temp->left != NULL)
			q.push(temp->left);
		if(temp->right != NULL)
			q.push(temp->right);
	}
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		cin >> N;
		Node *head = NULL;
		while(N--){
			int u, v;
			char x;
			cin >> u >> v >> x;
			if(head == NULL){
				head = makenode(u);
				Node *temp = makenode(v);
				if(x == 'L')
					head->left = temp;
				else
					head->right = temp;
			}
			else {
				insert(&head, u, v, x);
			}
		}
		leverOrder(&head);
		cout << endl;
	}
}
