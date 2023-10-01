package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I85Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b6Provider.get(request);
		int p2Val = b12Provider.get(request);
		int p3Val = b19Provider.get(request);
		int p4Val = b20Provider.get(request);
		int p5Val = b21Provider.get(request);
		int p6Val = b22Provider.get(request);
		int p7Val = b25Provider.get(request);
		int p8Val = b26Provider.get(request);
		int p9Val = b29Provider.get(request);
		int p10Val = b30Provider.get(request);
		int p11Val = b33Provider.get(request);
		int p12Val = b38Provider.get(request);
		int p13Val = b39Provider.get(request);
		int p14Val = b41Provider.get(request);
		int p15Val = b44Provider.get(request);
		int p16Val = b45Provider.get(request);
		
        try {
            Thread.sleep(45);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p17Val = b47Provider.get(request);
		int p18Val = b48Provider.get(request);
		int p19Val = b50Provider.get(request);
		int p20Val = i88Provider.get(request);
		int p21Val = i94Provider.get(request);
		int p22Val = i97Provider.get(request);
		int p23Val = i98Provider.get(request);
		int p24Val = i101Provider.get(request);
		int p25Val = i106Provider.get(request);
		int p26Val = i116Provider.get(request);
		
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p27Val = i117Provider.get(request);
		int p28Val = i121Provider.get(request);
		int p29Val = i122Provider.get(request);
		int p30Val = i125Provider.get(request);
		int p31Val = i126Provider.get(request);
		int p32Val = i128Provider.get(request);
		int p33Val = i131Provider.get(request);
		int p34Val = i134Provider.get(request);
		int p35Val = i135Provider.get(request);
		int p36Val = i137Provider.get(request);
		int p37Val = i140Provider.get(request);
		int p38Val = i142Provider.get(request);
		int p39Val = i143Provider.get(request);
		int p40Val = i144Provider.get(request);
		int p41Val = i145Provider.get(request);
		int p42Val = i148Provider.get(request);
		int p43Val = i151Provider.get(request);
		int p44Val = i156Provider.get(request);
		int p45Val = i158Provider.get(request);
		int p46Val = i165Provider.get(request);
		int p47Val = i168Provider.get(request);
		int p48Val = i174Provider.get(request);
		int p49Val = i176Provider.get(request);
		int p50Val = i180Provider.get(request);
		int p51Val = i183Provider.get(request);
		int p52Val = i184Provider.get(request);
		
        try {
            Thread.sleep(54);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p53Val = i186Provider.get(request);
		int p54Val = i189Provider.get(request);
		int p55Val = i191Provider.get(request);
		int p56Val = i194Provider.get(request);
		int p57Val = i200Provider.get(request);

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
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val;
    }
}
