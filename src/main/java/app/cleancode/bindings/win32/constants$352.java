// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$352 {

    static final FunctionDescriptor InSendMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle InSendMessage$MH = RuntimeHelper.downcallHandle(
        "InSendMessage",
        constants$352.InSendMessage$FUNC
    );
    static final FunctionDescriptor InSendMessageEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InSendMessageEx$MH = RuntimeHelper.downcallHandle(
        "InSendMessageEx",
        constants$352.InSendMessageEx$FUNC
    );
    static final FunctionDescriptor GetDoubleClickTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetDoubleClickTime$MH = RuntimeHelper.downcallHandle(
        "GetDoubleClickTime",
        constants$352.GetDoubleClickTime$FUNC
    );
    static final FunctionDescriptor SetDoubleClickTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDoubleClickTime$MH = RuntimeHelper.downcallHandle(
        "SetDoubleClickTime",
        constants$352.SetDoubleClickTime$FUNC
    );
    static final FunctionDescriptor RegisterClassA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassA$MH = RuntimeHelper.downcallHandle(
        "RegisterClassA",
        constants$352.RegisterClassA$FUNC
    );
    static final FunctionDescriptor RegisterClassW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassW$MH = RuntimeHelper.downcallHandle(
        "RegisterClassW",
        constants$352.RegisterClassW$FUNC
    );
}


