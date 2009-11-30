
    // OpenCL Kernel Function for element by element vector addition
    __kernel void VectorAdd(__global const float* a, __global const float* b, __global float* c, int numElements) {

        // get index into global data array
        int iGID = get_global_id(0);

        // bound check (equivalent to the limit on a 'for' loop for standard/serial C code
        if (iGID >= numElements)  {
            return;
        }

        // add the vector elements
        c[iGID] = a[iGID] + b[iGID];
    }