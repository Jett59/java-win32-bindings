// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$343 {

    static final FunctionDescriptor GetTitleBarInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTitleBarInfo$MH = RuntimeHelper.downcallHandle(
        "GetTitleBarInfo",
        constants$343.GetTitleBarInfo$FUNC
    );
    static final FunctionDescriptor GetMenuBarInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuBarInfo$MH = RuntimeHelper.downcallHandle(
        "GetMenuBarInfo",
        constants$343.GetMenuBarInfo$FUNC
    );
    static final FunctionDescriptor GetScrollBarInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetScrollBarInfo$MH = RuntimeHelper.downcallHandle(
        "GetScrollBarInfo",
        constants$343.GetScrollBarInfo$FUNC
    );
    static final FunctionDescriptor GetComboBoxInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComboBoxInfo$MH = RuntimeHelper.downcallHandle(
        "GetComboBoxInfo",
        constants$343.GetComboBoxInfo$FUNC
    );
    static final FunctionDescriptor GetAncestor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAncestor$MH = RuntimeHelper.downcallHandle(
        "GetAncestor",
        constants$343.GetAncestor$FUNC
    );
    static final FunctionDescriptor RealChildWindowFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle RealChildWindowFromPoint$MH = RuntimeHelper.downcallHandle(
        "RealChildWindowFromPoint",
        constants$343.RealChildWindowFromPoint$FUNC
    );
}

