// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$10 {

    static final FunctionDescriptor WriteNoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteNoFence$MH = RuntimeHelper.downcallHandle(
        "WriteNoFence",
        constants$10.WriteNoFence$FUNC
    );
    static final FunctionDescriptor ReadAcquire64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadAcquire64$MH = RuntimeHelper.downcallHandle(
        "ReadAcquire64",
        constants$10.ReadAcquire64$FUNC
    );
    static final FunctionDescriptor ReadNoFence64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadNoFence64$MH = RuntimeHelper.downcallHandle(
        "ReadNoFence64",
        constants$10.ReadNoFence64$FUNC
    );
    static final FunctionDescriptor WriteRelease64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteRelease64$MH = RuntimeHelper.downcallHandle(
        "WriteRelease64",
        constants$10.WriteRelease64$FUNC
    );
    static final FunctionDescriptor WriteNoFence64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteNoFence64$MH = RuntimeHelper.downcallHandle(
        "WriteNoFence64",
        constants$10.WriteNoFence64$FUNC
    );
    static final FunctionDescriptor ReadRaw8$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw8$MH = RuntimeHelper.downcallHandle(
        "ReadRaw8",
        constants$10.ReadRaw8$FUNC
    );
}

