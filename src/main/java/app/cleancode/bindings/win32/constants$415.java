// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$415 {

    static final FunctionDescriptor PhysicalToLogicalPointForPerMonitorDPI$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PhysicalToLogicalPointForPerMonitorDPI$MH = RuntimeHelper.downcallHandle(
        "PhysicalToLogicalPointForPerMonitorDPI",
        constants$415.PhysicalToLogicalPointForPerMonitorDPI$FUNC
    );
    static final FunctionDescriptor MapWindowPoints$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapWindowPoints$MH = RuntimeHelper.downcallHandle(
        "MapWindowPoints",
        constants$415.MapWindowPoints$FUNC
    );
    static final FunctionDescriptor WindowFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle WindowFromPoint$MH = RuntimeHelper.downcallHandle(
        "WindowFromPoint",
        constants$415.WindowFromPoint$FUNC
    );
    static final FunctionDescriptor WindowFromPhysicalPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle WindowFromPhysicalPoint$MH = RuntimeHelper.downcallHandle(
        "WindowFromPhysicalPoint",
        constants$415.WindowFromPhysicalPoint$FUNC
    );
    static final FunctionDescriptor ChildWindowFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle ChildWindowFromPoint$MH = RuntimeHelper.downcallHandle(
        "ChildWindowFromPoint",
        constants$415.ChildWindowFromPoint$FUNC
    );
    static final FunctionDescriptor ClipCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClipCursor$MH = RuntimeHelper.downcallHandle(
        "ClipCursor",
        constants$415.ClipCursor$FUNC
    );
}


