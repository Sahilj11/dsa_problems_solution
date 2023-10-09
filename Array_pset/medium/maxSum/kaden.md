Consider the input array:

```
[-2, 3, -4, 5, 7, -1, 2, 4, -3]
```

We'll visualize the algorithm's progress as we iterate through the array.

Step 1:
Initialize `max_so_far` and `max_ending_here` to the first element of the array, which is -2.

```
max_so_far = -2
max_ending_here = -2
```

Step 2 (Iteration 1):
Move to the next element, which is 3. We update `max_ending_here` by adding 3 to it. Since `max_ending_here` is still greater than `max_so_far`, we don't update `max_so_far`.

```
max_so_far = -2
max_ending_here = 3
```

Step 3 (Iteration 2):
Move to the next element, which is -4. We update `max_ending_here` by adding -4 to it. Since `max_ending_here` becomes negative, we reset it to 0 because any subarray starting from here would have a greater sum by excluding the previous elements.

```
max_so_far = 3
max_ending_here = 0
```

Step 4 (Iteration 3):
Move to the next element, which is 5. We update `max_ending_here` by adding 5 to it. Now, `max_ending_here` becomes greater than `max_so_far`, so we update `max_so_far` to the new value.

```
max_so_far = 5
max_ending_here = 5
```

Step 5 (Iteration 4):
Continue this process for the remaining elements in the array, updating `max_ending_here` and `max_so_far` as needed.

```
max_so_far = 12
max_ending_here = 12
```

Step 6 (Iteration 5):

```
max_so_far = 12
max_ending_here = 11
```

Step 7 (Iteration 6):

```
max_so_far = 12
max_ending_here = 12
```

Step 8 (Iteration 7):

```
max_so_far = 12
max_ending_here = 16
```

Step 9 (Iteration 8):

```
max_so_far = 16
max_ending_here = 13
```

Step 10 (Iteration 9):

```
max_so_far = 16
max_ending_here = 16
```

The algorithm finishes iterating through the entire array, and `max_so_far` holds the maximum subarray sum, which is 16.

So, in this example, the maximum subarray sum is 16, and Kadane's algorithm successfully found it. The key idea is to keep track of the maximum sum ending at the current position while also updating the global maximum sum encountered so far. This allows the algorithm to efficiently find the maximum subarray sum in a single pass through the array.

this algo will handle all -ve elements also.
