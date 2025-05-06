
/* The structure of the class is
class StackQueue{
private:
    // These are STL stacks ( http://goo.gl/LxlRZQ )
    stack<int> s1;
    stack<int> s2;
public:
    void push(int);
    int pop();
}; */

void StackQueue::push(int x) {
    // Move all elements from s1 to s2
    while (!s1.empty()) {
        s2.push(s1.top());
        s1.pop();
    }

    // Push the new element into s1
    s1.push(x);

    // Move everything back to s1 from s2
    while (!s2.empty()) {
        s1.push(s2.top());
        s2.pop();
    }
}

int StackQueue::pop() {
    if (s1.empty()) return -1; // Optional error code if queue is empty
    int front = s1.top();
    s1.pop();
    return front;
}
