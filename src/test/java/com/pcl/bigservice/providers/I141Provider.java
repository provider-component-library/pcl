package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I141Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b21Provider.get(request);
		int p8Val = b22Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b29Provider.get(request);
		
        try {
            Thread.sleep(45);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p11Val = b30Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b36Provider.get(request);
		int p15Val = b46Provider.get(request);
		int p16Val = i142Provider.get(request);
		int p17Val = i144Provider.get(request);
		int p18Val = i145Provider.get(request);
		
        try {
            Thread.sleep(84);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = i151Provider.get(request);
		int p20Val = i152Provider.get(request);
		int p21Val = i153Provider.get(request);
		int p22Val = i155Provider.get(request);
		int p23Val = i158Provider.get(request);
		int p24Val = i159Provider.get(request);
		int p25Val = i160Provider.get(request);
		int p26Val = i161Provider.get(request);
		int p27Val = i164Provider.get(request);
		int p28Val = i166Provider.get(request);
		
        try {
            Thread.sleep(86);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p29Val = i169Provider.get(request);
		int p30Val = i174Provider.get(request);
		int p31Val = i175Provider.get(request);
		int p32Val = i176Provider.get(request);
		int p33Val = i177Provider.get(request);
		int p34Val = i182Provider.get(request);
		int p35Val = i185Provider.get(request);
		int p36Val = i186Provider.get(request);
		int p37Val = i193Provider.get(request);
		int p38Val = i194Provider.get(request);
		int p39Val = i196Provider.get(request);
		int p40Val = i198Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val;
    }
}
