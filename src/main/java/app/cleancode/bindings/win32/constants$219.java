// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$219 {

    static final FunctionDescriptor QueryDosDeviceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QueryDosDeviceA$MH = RuntimeHelper.downcallHandle(
        "QueryDosDeviceA",
        constants$219.QueryDosDeviceA$FUNC
    );
    static final FunctionDescriptor CreateFileTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileTransactedA$MH = RuntimeHelper.downcallHandle(
        "CreateFileTransactedA",
        constants$219.CreateFileTransactedA$FUNC
    );
    static final FunctionDescriptor CreateFileTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileTransactedW$MH = RuntimeHelper.downcallHandle(
        "CreateFileTransactedW",
        constants$219.CreateFileTransactedW$FUNC
    );
    static final FunctionDescriptor ReOpenFile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReOpenFile$MH = RuntimeHelper.downcallHandle(
        "ReOpenFile",
        constants$219.ReOpenFile$FUNC
    );
    static final FunctionDescriptor SetFileAttributesTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileAttributesTransactedA$MH = RuntimeHelper.downcallHandle(
        "SetFileAttributesTransactedA",
        constants$219.SetFileAttributesTransactedA$FUNC
    );
    static final FunctionDescriptor SetFileAttributesTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileAttributesTransactedW$MH = RuntimeHelper.downcallHandle(
        "SetFileAttributesTransactedW",
        constants$219.SetFileAttributesTransactedW$FUNC
    );
}


