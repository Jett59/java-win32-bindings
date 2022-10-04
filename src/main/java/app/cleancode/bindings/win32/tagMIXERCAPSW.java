// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIXERCAPSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("fdwSupport"),
        Constants$root.C_LONG$LAYOUT.withName("cDestinations")
    ).withName("tagMIXERCAPSW");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERCAPSW.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagMIXERCAPSW.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagMIXERCAPSW.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagMIXERCAPSW.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagMIXERCAPSW.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagMIXERCAPSW.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagMIXERCAPSW.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagMIXERCAPSW.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagMIXERCAPSW.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagMIXERCAPSW.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagMIXERCAPSW.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagMIXERCAPSW.vDriverVersion$VH;
    }
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagMIXERCAPSW.vDriverVersion$VH.get(seg);
    }
    public static void vDriverVersion$set( MemorySegment seg, int x) {
        tagMIXERCAPSW.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPSW.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPSW.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    static final VarHandle fdwSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fdwSupport"));
    public static VarHandle fdwSupport$VH() {
        return tagMIXERCAPSW.fdwSupport$VH;
    }
    public static int fdwSupport$get(MemorySegment seg) {
        return (int)tagMIXERCAPSW.fdwSupport$VH.get(seg);
    }
    public static void fdwSupport$set( MemorySegment seg, int x) {
        tagMIXERCAPSW.fdwSupport$VH.set(seg, x);
    }
    public static int fdwSupport$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPSW.fdwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fdwSupport$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPSW.fdwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cDestinations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cDestinations"));
    public static VarHandle cDestinations$VH() {
        return tagMIXERCAPSW.cDestinations$VH;
    }
    public static int cDestinations$get(MemorySegment seg) {
        return (int)tagMIXERCAPSW.cDestinations$VH.get(seg);
    }
    public static void cDestinations$set( MemorySegment seg, int x) {
        tagMIXERCAPSW.cDestinations$VH.set(seg, x);
    }
    public static int cDestinations$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPSW.cDestinations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDestinations$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPSW.cDestinations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


