// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$273 {

    static final FunctionDescriptor VkKeyScanA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle VkKeyScanA$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanA",
        constants$273.VkKeyScanA$FUNC
    );
    static final FunctionDescriptor VkKeyScanW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle VkKeyScanW$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanW",
        constants$273.VkKeyScanW$FUNC
    );
    static final FunctionDescriptor VkKeyScanExA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VkKeyScanExA$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanExA",
        constants$273.VkKeyScanExA$FUNC
    );
    static final FunctionDescriptor VkKeyScanExW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VkKeyScanExW$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanExW",
        constants$273.VkKeyScanExW$FUNC
    );
    static final FunctionDescriptor keybd_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle keybd_event$MH = RuntimeHelper.downcallHandle(
        "keybd_event",
        constants$273.keybd_event$FUNC
    );
    static final FunctionDescriptor mouse_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mouse_event$MH = RuntimeHelper.downcallHandle(
        "mouse_event",
        constants$273.mouse_event$FUNC
    );
}


