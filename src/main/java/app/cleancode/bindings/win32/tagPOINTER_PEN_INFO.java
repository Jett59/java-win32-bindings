// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPOINTER_PEN_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("pointerType"),
            Constants$root.C_LONG$LAYOUT.withName("pointerId"),
            Constants$root.C_LONG$LAYOUT.withName("frameId"),
            Constants$root.C_LONG$LAYOUT.withName("pointerFlags"),
            Constants$root.C_POINTER$LAYOUT.withName("sourceDevice"),
            Constants$root.C_POINTER$LAYOUT.withName("hwndTarget"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("x"),
                Constants$root.C_LONG$LAYOUT.withName("y")
            ).withName("ptPixelLocation"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("x"),
                Constants$root.C_LONG$LAYOUT.withName("y")
            ).withName("ptHimetricLocation"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("x"),
                Constants$root.C_LONG$LAYOUT.withName("y")
            ).withName("ptPixelLocationRaw"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("x"),
                Constants$root.C_LONG$LAYOUT.withName("y")
            ).withName("ptHimetricLocationRaw"),
            Constants$root.C_LONG$LAYOUT.withName("dwTime"),
            Constants$root.C_LONG$LAYOUT.withName("historyCount"),
            Constants$root.C_LONG$LAYOUT.withName("InputData"),
            Constants$root.C_LONG$LAYOUT.withName("dwKeyStates"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("PerformanceCount"),
            Constants$root.C_LONG$LAYOUT.withName("ButtonChangeType"),
            MemoryLayout.paddingLayout(32)
        ).withName("pointerInfo"),
        Constants$root.C_LONG$LAYOUT.withName("penFlags"),
        Constants$root.C_LONG$LAYOUT.withName("penMask"),
        Constants$root.C_LONG$LAYOUT.withName("pressure"),
        Constants$root.C_LONG$LAYOUT.withName("rotation"),
        Constants$root.C_LONG$LAYOUT.withName("tiltX"),
        Constants$root.C_LONG$LAYOUT.withName("tiltY")
    ).withName("tagPOINTER_PEN_INFO");
    public static MemoryLayout $LAYOUT() {
        return tagPOINTER_PEN_INFO.$struct$LAYOUT;
    }
    public static MemorySegment pointerInfo$slice(MemorySegment seg) {
        return seg.asSlice(0, 96);
    }
    static final VarHandle penFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("penFlags"));
    public static VarHandle penFlags$VH() {
        return tagPOINTER_PEN_INFO.penFlags$VH;
    }
    public static int penFlags$get(MemorySegment seg) {
        return (int)tagPOINTER_PEN_INFO.penFlags$VH.get(seg);
    }
    public static void penFlags$set( MemorySegment seg, int x) {
        tagPOINTER_PEN_INFO.penFlags$VH.set(seg, x);
    }
    public static int penFlags$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_PEN_INFO.penFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void penFlags$set(MemorySegment seg, long index, int x) {
        tagPOINTER_PEN_INFO.penFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle penMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("penMask"));
    public static VarHandle penMask$VH() {
        return tagPOINTER_PEN_INFO.penMask$VH;
    }
    public static int penMask$get(MemorySegment seg) {
        return (int)tagPOINTER_PEN_INFO.penMask$VH.get(seg);
    }
    public static void penMask$set( MemorySegment seg, int x) {
        tagPOINTER_PEN_INFO.penMask$VH.set(seg, x);
    }
    public static int penMask$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_PEN_INFO.penMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void penMask$set(MemorySegment seg, long index, int x) {
        tagPOINTER_PEN_INFO.penMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pressure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pressure"));
    public static VarHandle pressure$VH() {
        return tagPOINTER_PEN_INFO.pressure$VH;
    }
    public static int pressure$get(MemorySegment seg) {
        return (int)tagPOINTER_PEN_INFO.pressure$VH.get(seg);
    }
    public static void pressure$set( MemorySegment seg, int x) {
        tagPOINTER_PEN_INFO.pressure$VH.set(seg, x);
    }
    public static int pressure$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_PEN_INFO.pressure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pressure$set(MemorySegment seg, long index, int x) {
        tagPOINTER_PEN_INFO.pressure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rotation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rotation"));
    public static VarHandle rotation$VH() {
        return tagPOINTER_PEN_INFO.rotation$VH;
    }
    public static int rotation$get(MemorySegment seg) {
        return (int)tagPOINTER_PEN_INFO.rotation$VH.get(seg);
    }
    public static void rotation$set( MemorySegment seg, int x) {
        tagPOINTER_PEN_INFO.rotation$VH.set(seg, x);
    }
    public static int rotation$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_PEN_INFO.rotation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rotation$set(MemorySegment seg, long index, int x) {
        tagPOINTER_PEN_INFO.rotation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tiltX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tiltX"));
    public static VarHandle tiltX$VH() {
        return tagPOINTER_PEN_INFO.tiltX$VH;
    }
    public static int tiltX$get(MemorySegment seg) {
        return (int)tagPOINTER_PEN_INFO.tiltX$VH.get(seg);
    }
    public static void tiltX$set( MemorySegment seg, int x) {
        tagPOINTER_PEN_INFO.tiltX$VH.set(seg, x);
    }
    public static int tiltX$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_PEN_INFO.tiltX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tiltX$set(MemorySegment seg, long index, int x) {
        tagPOINTER_PEN_INFO.tiltX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tiltY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tiltY"));
    public static VarHandle tiltY$VH() {
        return tagPOINTER_PEN_INFO.tiltY$VH;
    }
    public static int tiltY$get(MemorySegment seg) {
        return (int)tagPOINTER_PEN_INFO.tiltY$VH.get(seg);
    }
    public static void tiltY$set( MemorySegment seg, int x) {
        tagPOINTER_PEN_INFO.tiltY$VH.set(seg, x);
    }
    public static int tiltY$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_PEN_INFO.tiltY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tiltY$set(MemorySegment seg, long index, int x) {
        tagPOINTER_PEN_INFO.tiltY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


