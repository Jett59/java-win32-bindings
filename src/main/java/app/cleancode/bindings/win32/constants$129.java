// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$129 {

    static final FunctionDescriptor GetSystemDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemDirectoryA$MH = RuntimeHelper.downcallHandle(
        "GetSystemDirectoryA",
        constants$129.GetSystemDirectoryA$FUNC
    );
    static final FunctionDescriptor GetSystemDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetSystemDirectoryW",
        constants$129.GetSystemDirectoryW$FUNC
    );
    static final FunctionDescriptor GetWindowsDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindowsDirectoryA$MH = RuntimeHelper.downcallHandle(
        "GetWindowsDirectoryA",
        constants$129.GetWindowsDirectoryA$FUNC
    );
    static final FunctionDescriptor GetWindowsDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindowsDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetWindowsDirectoryW",
        constants$129.GetWindowsDirectoryW$FUNC
    );
    static final FunctionDescriptor GetSystemWindowsDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemWindowsDirectoryA$MH = RuntimeHelper.downcallHandle(
        "GetSystemWindowsDirectoryA",
        constants$129.GetSystemWindowsDirectoryA$FUNC
    );
    static final FunctionDescriptor GetSystemWindowsDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemWindowsDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetSystemWindowsDirectoryW",
        constants$129.GetSystemWindowsDirectoryW$FUNC
    );
}


