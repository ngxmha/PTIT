#include<iostream>
#include<map>
using namespace std;

int n;
map<int, int> mp;

struct Node{
	int data;
	Node *next;
};

Node* makenode(int x){
	Node* newnode = new Node;
	newnode->data = x;
	newnode->next = NULL;
	return newnode;
}

void pushback(Node** head, int x){
	if(*head == NULL){
		Node* newnode = makenode(x);
		*head = newnode;
		return;
	}
	Node* tmp = *head;
	while(tmp->next != NULL){
		tmp = tmp->next;
	}
	Node* newnode = makenode(x);
	tmp->next = newnode;
}

void erase(Node** head){
	for(Node* i = *head; i != NULL; i = i->next){
		int a = i->data;
		if(mp[a] == 1)
			continue;
		mp[a] = 1;
		cout << a << " ";
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	cin >> n;
	Node* head = NULL;
	for(int i = 1; i <= n; i++){
		int x;
		cin >> x;
		pushback(&head, x);
	}
	erase(&head);
}
	