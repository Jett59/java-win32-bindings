// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$422 {

    static final FunctionDescriptor GetClassLongPtrW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetClassLongPtrW$MH = RuntimeHelper.downcallHandle(
        "GetClassLongPtrW",
        constants$422.GetClassLongPtrW$FUNC
    );
    static final FunctionDescriptor SetClassLongPtrA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetClassLongPtrA$MH = RuntimeHelper.downcallHandle(
        "SetClassLongPtrA",
        constants$422.SetClassLongPtrA$FUNC
    );
    static final FunctionDescriptor SetClassLongPtrW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetClassLongPtrW$MH = RuntimeHelper.downcallHandle(
        "SetClassLongPtrW",
        constants$422.SetClassLongPtrW$FUNC
    );
    static final FunctionDescriptor GetProcessDefaultLayout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessDefaultLayout$MH = RuntimeHelper.downcallHandle(
        "GetProcessDefaultLayout",
        constants$422.GetProcessDefaultLayout$FUNC
    );
    static final FunctionDescriptor SetProcessDefaultLayout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessDefaultLayout$MH = RuntimeHelper.downcallHandle(
        "SetProcessDefaultLayout",
        constants$422.SetProcessDefaultLayout$FUNC
    );
    static final FunctionDescriptor GetDesktopWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetDesktopWindow$MH = RuntimeHelper.downcallHandle(
        "GetDesktopWindow",
        constants$422.GetDesktopWindow$FUNC
    );
}


