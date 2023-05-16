#include<iostream>
using namespace std;

int n, m;

struct Node{
	int data;
	Node *next;
};

Node *makenode(int x){
	Node *newnode = new Node;
	newnode->data = x;
	newnode->next = NULL;
	return newnode;
}

void pushback(Node **head, int x){
	if(*head == NULL){
		Node *newnode = makenode(x);
		*head = newnode;
	}
	else {
		Node *newnode = makenode(x);
		Node *tmp = *head;
		while(tmp->next != NULL){
			tmp = tmp->next;
		}
		tmp->next = newnode;
	}
}

void erase(Node **head){
	Node *tmp = *head;
	while(tmp != NULL){
		if(tmp->data == m){
			Node *i = tmp;
			if(tmp == *head){
				*head = (*head)->next;
			}
			else {
				Node *tmp2 = *head;
				while(tmp2->next != tmp){
					tmp2 = tmp2->next;
				}
				tmp2->next = tmp->next;
			}
			tmp = tmp->next;
			delete i;
		}
		else 
			tmp = tmp->next;
	}
}

void out(Node *head){
	while(head != NULL){
		cout << head->data << " "; 
		head = head->next;
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	Node *head = NULL;
	cin >> n;
	for(int i = 0; i < n; i++){
		int x;
		cin >> x;
		pushback(&head, x);
	}
	cin >> m;
	erase(&head);
	out(head);
}
