// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$543 {

    static final FunctionDescriptor joyGetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetThreshold$MH = RuntimeHelper.downcallHandle(
        "joyGetThreshold",
        constants$543.joyGetThreshold$FUNC
    );
    static final FunctionDescriptor joyReleaseCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyReleaseCapture$MH = RuntimeHelper.downcallHandle(
        "joyReleaseCapture",
        constants$543.joyReleaseCapture$FUNC
    );
    static final FunctionDescriptor joySetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetCapture$MH = RuntimeHelper.downcallHandle(
        "joySetCapture",
        constants$543.joySetCapture$FUNC
    );
    static final FunctionDescriptor joySetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetThreshold$MH = RuntimeHelper.downcallHandle(
        "joySetThreshold",
        constants$543.joySetThreshold$FUNC
    );
    static final FunctionDescriptor joyConfigChanged$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyConfigChanged$MH = RuntimeHelper.downcallHandle(
        "joyConfigChanged",
        constants$543.joyConfigChanged$FUNC
    );
    static final FunctionDescriptor CommandLineToArgvW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CommandLineToArgvW$MH = RuntimeHelper.downcallHandle(
        "CommandLineToArgvW",
        constants$543.CommandLineToArgvW$FUNC
    );
}


