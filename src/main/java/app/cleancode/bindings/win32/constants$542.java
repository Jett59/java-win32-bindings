// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$542 {

    static final FunctionDescriptor timeEndPeriod$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle timeEndPeriod$MH = RuntimeHelper.downcallHandle(
        "timeEndPeriod",
        constants$542.timeEndPeriod$FUNC
    );
    static final FunctionDescriptor joyGetPosEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetPosEx$MH = RuntimeHelper.downcallHandle(
        "joyGetPosEx",
        constants$542.joyGetPosEx$FUNC
    );
    static final FunctionDescriptor joyGetNumDevs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle joyGetNumDevs$MH = RuntimeHelper.downcallHandle(
        "joyGetNumDevs",
        constants$542.joyGetNumDevs$FUNC
    );
    static final FunctionDescriptor joyGetDevCapsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyGetDevCapsA$MH = RuntimeHelper.downcallHandle(
        "joyGetDevCapsA",
        constants$542.joyGetDevCapsA$FUNC
    );
    static final FunctionDescriptor joyGetDevCapsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyGetDevCapsW$MH = RuntimeHelper.downcallHandle(
        "joyGetDevCapsW",
        constants$542.joyGetDevCapsW$FUNC
    );
    static final FunctionDescriptor joyGetPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetPos$MH = RuntimeHelper.downcallHandle(
        "joyGetPos",
        constants$542.joyGetPos$FUNC
    );
}


