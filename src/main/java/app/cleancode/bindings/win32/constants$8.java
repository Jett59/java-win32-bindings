// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$8 {

    static final FunctionDescriptor PTERMINATION_HANDLER$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTERMINATION_HANDLER$MH = RuntimeHelper.downcallHandle(
        constants$8.PTERMINATION_HANDLER$FUNC
    );
    static final FunctionDescriptor ReadAcquire8$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadAcquire8$MH = RuntimeHelper.downcallHandle(
        "ReadAcquire8",
        constants$8.ReadAcquire8$FUNC
    );
    static final FunctionDescriptor ReadNoFence8$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadNoFence8$MH = RuntimeHelper.downcallHandle(
        "ReadNoFence8",
        constants$8.ReadNoFence8$FUNC
    );
    static final FunctionDescriptor WriteRelease8$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteRelease8$MH = RuntimeHelper.downcallHandle(
        "WriteRelease8",
        constants$8.WriteRelease8$FUNC
    );
    static final FunctionDescriptor WriteNoFence8$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteNoFence8$MH = RuntimeHelper.downcallHandle(
        "WriteNoFence8",
        constants$8.WriteNoFence8$FUNC
    );
    static final FunctionDescriptor ReadAcquire16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadAcquire16$MH = RuntimeHelper.downcallHandle(
        "ReadAcquire16",
        constants$8.ReadAcquire16$FUNC
    );
}


