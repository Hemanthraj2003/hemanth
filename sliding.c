#include <stdio.h>
#include <unistd.h> // for sleep
#define RTT 5

int main()
{
    int window_size, i, f, frames[50];

    printf("Enter window size: ");
    scanf("%d", &window_size); // Read window size

    printf("\nEnter number of frames to transmit: ");
    scanf("%d", &f); // Read number of frames

    printf("\nEnter %d frames: ", f);
    for (i = 0; i < f; i++)
    {
        scanf("%d", &frames[i]); // Read frame values
    }

    printf("\nAfter sending %d frames at each stage sender waits for ACK\n", window_size);
    printf("Sending frames in the following manner:\n\n");

    for (i = 0; i < f; i++)
    {
        // Send the frame
        printf(" %d", frames[i]);

        // Check if we have sent `window_size` frames or if it's the last frame
        if ((i + 1) % window_size == 0 || i == f - 1)
        {
            printf("\nSENDER: waiting for ACK...\n");
            sleep(RTT / 2); // wait for RTT/2
            printf("RECEIVER: Frames Received, ACK Sent\n");
            sleep(RTT / 2); // wait for RTT/2
            printf("SENDER: ACK received, sending next frames\n\n");
        }
    }

    // In case the last set of frames sent is less than the window size
    if (f % window_size != 0)
    {
        printf("\nSENDER: waiting for ACK...\n");
        sleep(RTT / 2); // wait for RTT/2
        printf("RECEIVER: Frames Received, ACK Sent\n");
        sleep(RTT / 2); // wait for RTT/2
        printf("SENDER: ACK received.\n");
    }

    return 0;
}
