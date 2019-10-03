#include "iostream"

class Node{
    public:
        int data;
        Node* next;
};

void printList(Node* n){
    while(n!=NULL){
        std::cout << n->data << "\n";
        n=n->next;
    }
}

Node* push(Node* head,int data){
    Node* tmp = new Node();
    tmp->data=data;
    tmp->next=head;
    return tmp;
}

void append(Node** head,int data){
    Node* tmp= new Node();
    tmp->data=data;
    tmp->next=NULL;
    Node* q=*head;
    while(q->next!=NULL){
        q=q->next;
    }
    q->next=tmp;
    
}

int main(){
    Node* head = NULL; 
    Node* second = NULL; 
    Node* third = NULL; 
  
    // allocate 3 nodes in the heap 
    head = new Node(); 
    second = new Node(); 
    third = new Node(); 
  
    head->data = 1; // assign data in first node 
    head->next = second; // Link first node with second 
  
    second->data = 2; // assign data to second node 
    second->next = third; 
  
    third->data = 3; // assign data to third node 
    third->next = NULL; 

    head=push(head,55);
    append(&head,90);
    printList(head); 
  
    return 0; 
}
