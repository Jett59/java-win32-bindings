// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$58 {

    static final FunctionDescriptor RtlQueryDepthSList$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlQueryDepthSList$MH = RuntimeHelper.downcallHandle(
        "RtlQueryDepthSList",
        constants$58.RtlQueryDepthSList$FUNC
    );
    static final FunctionDescriptor RtlGetReturnAddressHijackTarget$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle RtlGetReturnAddressHijackTarget$MH = RuntimeHelper.downcallHandle(
        "RtlGetReturnAddressHijackTarget",
        constants$58.RtlGetReturnAddressHijackTarget$FUNC
    );
    static final FunctionDescriptor HEAP_MAKE_TAG_FLAGS$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HEAP_MAKE_TAG_FLAGS$MH = RuntimeHelper.downcallHandle(
        "HEAP_MAKE_TAG_FLAGS",
        constants$58.HEAP_MAKE_TAG_FLAGS$FUNC
    );
    static final FunctionDescriptor RtlSecureZeroMemory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlSecureZeroMemory$MH = RuntimeHelper.downcallHandle(
        "RtlSecureZeroMemory",
        constants$58.RtlSecureZeroMemory$FUNC
    );
    static final FunctionDescriptor VerSetConditionMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle VerSetConditionMask$MH = RuntimeHelper.downcallHandle(
        "VerSetConditionMask",
        constants$58.VerSetConditionMask$FUNC
    );
    static final FunctionDescriptor RtlGetProductInfo$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlGetProductInfo$MH = RuntimeHelper.downcallHandle(
        "RtlGetProductInfo",
        constants$58.RtlGetProductInfo$FUNC
    );
}


