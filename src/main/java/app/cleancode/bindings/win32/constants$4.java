// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$4 {

    static final FunctionDescriptor _mm_clflush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mm_clflush$MH = RuntimeHelper.downcallHandle(
        "_mm_clflush",
        constants$4._mm_clflush$FUNC
    );
    static final FunctionDescriptor _mm_lfence$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _mm_lfence$MH = RuntimeHelper.downcallHandle(
        "_mm_lfence",
        constants$4._mm_lfence$FUNC
    );
    static final FunctionDescriptor _mm_mfence$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _mm_mfence$MH = RuntimeHelper.downcallHandle(
        "_mm_mfence",
        constants$4._mm_mfence$FUNC
    );
    static final FunctionDescriptor _mm_sfence$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _mm_sfence$MH = RuntimeHelper.downcallHandle(
        "_mm_sfence",
        constants$4._mm_sfence$FUNC
    );
    static final FunctionDescriptor _mm_pause$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _mm_pause$MH = RuntimeHelper.downcallHandle(
        "_mm_pause",
        constants$4._mm_pause$FUNC
    );
    static final FunctionDescriptor _mm_prefetch$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _mm_prefetch$MH = RuntimeHelper.downcallHandle(
        "_mm_prefetch",
        constants$4._mm_prefetch$FUNC
    );
}


